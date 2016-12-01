package com.maskibth.service;


import com.maskibth.util.FileLoaderUtil;

import java.util.List;

public class DeployCommand {

    public void process() {


        // Load the file names in asc order
        List<String> files = FileLoaderUtil.loadFileNamesInAscendingOrder("");

        // check if version manager node exists. if yes, lock version manager and retrieve versions. If not, create one and lock it


        // for each file, create version node (if not present) and execute cypher in one tx. else update version node and execute cypher in one tx
        // fail fast
        // unlock version manager



    }
}
