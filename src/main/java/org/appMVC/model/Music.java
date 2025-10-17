package org.appMVC.model;

public class Music {
    private String music_name;
    private String music_file_type;

    public String getMusic_file_type() {
        return music_file_type;
    }

    public String getMusic_name() {
        return music_name;
    }

    public void setMusic_file_type(String music_file_type) {
        this.music_file_type = music_file_type;
    }

    public void setMusic_name(String music_name) {
        this.music_name = music_name;
    }
}
