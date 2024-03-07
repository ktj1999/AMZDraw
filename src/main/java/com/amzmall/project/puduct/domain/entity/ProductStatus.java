package com.amzmall.project.puduct.domain.entity;

public enum ProductStatus {
    ACTIVE("서비스중"),
    READY("서비스 준비중"),
    DISABLED("사용 안함");

    private final String description;

    ProductStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}