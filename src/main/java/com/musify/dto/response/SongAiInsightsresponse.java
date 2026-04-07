package com.musify.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Add your annotations here
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongAiInsightsresponse {

    private String analysis;
    private List<String> moods;
    private String genre;
    private String tempo;
    private String key;
    private Integer energy;
    private List<String> similarArtists;
    private String recommendedFor;
}
