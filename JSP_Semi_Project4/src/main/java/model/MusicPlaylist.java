package model;

public class MusicPlaylist {
    private int playlistId;
    private int musicId;

    public MusicPlaylist(int playlistId, int musicId) {
        this.playlistId = playlistId;
        this.musicId = musicId;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }
}