package io.varsity.playerctl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Process utilities.
 */
public class Process {

    /**
     * Path to the playerctl binary.
     */
    private final String PLAYERCTL_PATH = "/usr/bin/playerctl";

    /**
     * Currently active runtime.
     */
    private final Runtime RUNTIME = Runtime.getRuntime();

    /**
     * Checks if playerctl is installed or not.
     */
    public boolean isInstalled() {
        return Files.exists(Paths.get(PLAYERCTL_PATH));
    }

    /**
     * Runs a command and returns the output.
     */
    public String runCommand(final String... arguments) throws IOException {
        if (!System.getProperty("os.name").equalsIgnoreCase("Linux"))
            throw new AccessDeniedException("This library only supports Linux!");

        if (!isInstalled())
            throw new FileNotFoundException("Playerctl wasn't found in '" + PLAYERCTL_PATH + "', please make sure that it's been installed correctly!");

        final java.lang.Process launched = RUNTIME.exec(arguments);
        final StringBuilder result = new StringBuilder(512);
        try (BufferedReader in = new BufferedReader(new InputStreamReader(launched.getInputStream()))) {
            while (true) {
                String line = in.readLine();
                if (line == null) break;
                result.append(line);
            }
        }

        return result.toString();
    }
}