package command.search;

import command.Command;
import db.Cache;

public class SearchCommand implements Command {
    Cache cache;
    String query = "";

    public SearchCommand(Cache cache) {
        this.cache = cache;
    }

    public void setParameters(String query) {
        this.query = query;
    }

    public void execute(){
        cache.search(query);
    }
}

