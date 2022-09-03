package io.varsity.playerctl;

import java.io.IOException;

/**
 * Fetches Spotify playerctl.
 */
public class PlayerCTL {

    /**
     * String-array cache.
     */
    private final ArrayCache ARRAY_CACHE = new ArrayCache();

    /**
     * {@code Process} instance.
     */
    private final Process PROCESS = new Process();

    /**
     * Returns the current song title.
     */
    public String getTitle() throws IOException {
        return PROCESS.runCommand(ARRAY_CACHE.TITLE);
    }

    /**
     * Returns the current song album.
     */
    public String getAlbum() throws IOException {
        return PROCESS.runCommand(ARRAY_CACHE.ALBUM);
    }

    /**
     * Returns the current song album artist.
     */
    public String getAlbumArtist() throws IOException {
        return PROCESS.runCommand(ARRAY_CACHE.ALBUM_ARTIST);
    }

    /**
     * Returns the current song artist.
     */
    public String getArtist() throws IOException {
        return PROCESS.runCommand(ARRAY_CACHE.ARTIST);
    }

    /**
     * Returns the current song art url.
     */
    public String getArt() throws IOException {
        return PROCESS.runCommand(ARRAY_CACHE.ART);
    }

    /**
     * Returns the current song url.
     */
    public String getURL() throws IOException {
        return PROCESS.runCommand(ARRAY_CACHE.URL);
    }
}