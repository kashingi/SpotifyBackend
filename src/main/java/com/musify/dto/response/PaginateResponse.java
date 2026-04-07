package com.musify.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Add your annotations here
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginateResponse<T> {

    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    private boolean last;
    private boolean first;
}
