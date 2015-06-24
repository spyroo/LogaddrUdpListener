package io.github.spyroo.logs.factories;

import io.github.spyroo.logs.structure.LogLine;

public class LogLineFactory implements Factory<LogLine, String>{

    protected LogLineFactory(){
        //nothing here, I just need loglinefactory to be protected
    }

    @Override
    public LogLine create(String arg) {
        return null;
    }
}
