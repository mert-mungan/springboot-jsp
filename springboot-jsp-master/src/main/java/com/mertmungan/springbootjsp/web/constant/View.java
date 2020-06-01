package com.mertmungan.springbootjsp.web.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum View {
    HOME(Constants.ROOT + "index");

    private final String path;

    private static class Constants {
        private static final String ROOT = "views/";

        private Constants() {
        }
    }
}
