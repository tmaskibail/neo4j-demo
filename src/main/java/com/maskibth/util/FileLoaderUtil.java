package com.maskibth.util;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileLoaderUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileLoaderUtil.class);

    public static List<String> loadFileNamesInAscendingOrder(String absoluteDirectoryPath) {

        if ("".equals(StringUtils.trimToEmpty(absoluteDirectoryPath))) {
            LOGGER.error("Please provide a valid path to folder containing deployment scripts");
        }

        File fileDir = new File(absoluteDirectoryPath);
        List<String> fileNameList = null;
        if (fileDir.isDirectory()) {
            fileNameList = Arrays.asList(fileDir.list());
            Collections.sort(fileNameList);

            if (LOGGER.isDebugEnabled()) {
                for (String fileName : fileNameList) {
                    LOGGER.debug("Loaded file : {}", fileName);
                }
            }
        } else {
            LOGGER.error("{} isn't a directory. Please provide a valid path to folder containing deployment scripts", absoluteDirectoryPath);
        }

        return fileNameList;
    }
}