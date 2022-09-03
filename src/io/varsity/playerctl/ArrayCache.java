package io.varsity.playerctl;

/**
 * Cache of string-arrays.
 */
public class ArrayCache {
    public final String[] TITLE = new String[]{"playerctl", "-p", "spotify", "metadata", "xesam:title"};
    public final String[] ALBUM = new String[]{"playerctl", "-p", "spotify", "metadata", "xesam:album"};
    public final String[] ALBUM_ARTIST = new String[]{"playerctl", "-p", "spotify", "metadata", "xesam:albumArtist"};
    public final String[] ARTIST = new String[]{"playerctl", "-p", "spotify", "metadata", "xesam:arist"};
    public final String[] ART = new String[]{"playerctl", "-p", "spotify", "metadata", "mpris:artUrl"};
    public final String[] URL = new String[]{"playerctl", "-p", "spotify", "metadata", "xesam:url"};
}