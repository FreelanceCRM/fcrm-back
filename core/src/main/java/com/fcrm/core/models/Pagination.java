package com.fcrm.core.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Pagination<T> {
    private List<T> items;

    private long totalItems;

    private int totalPages;

    private int currentPage;
}
