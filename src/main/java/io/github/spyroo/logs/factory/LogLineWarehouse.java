package io.github.spyroo.logs.factory;

import io.github.spyroo.logs.structure.LogLine;

import java.util.ArrayList;
import java.util.List;

public class LogLineWarehouse implements Warehouse<LogLine, Integer>{

    private ArrayList<LogLine> loglines;

    protected LogLineWarehouse(){

    }

    @Override
    public Integer store(LogLine obj) {
        loglines.add(obj);
        return loglines.size() - 1;
    }

    @Override
    public LogLine discard(Integer id) {
        LogLine line = loglines.get(id);
        loglines.remove(id);
        return line;
    }

    @Override
    public List<LogLine> getInventory() {
        return loglines;
    }

    @Override
    public int size() {
        return loglines.size();
    }
}
