/* Authors: William Chen and Chijun Sha */

package SongLibrary.model;

import java.io.Serializable;

public class SongItem implements Serializable {
    private static final long serialVersionUID = 546878600l;

    public static String makeKey(String _name, String _artist) {
        return (_name + "_____BY_____" + _artist).toUpperCase();
    }

    String name;
    String artist;
    String album;
    String year;

    public SongItem (String _name, String _artist, String _album, String _year) {
        name = _name;
        artist = _artist;
        album = _album;
        year = _year;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getKey () {
        return makeKey(name, artist);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(SongItem songItem) {
        return this.getKey().compareTo(songItem.getKey());
    }
}
