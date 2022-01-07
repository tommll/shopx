package db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cache {
    ArrayList<String> keywordList = new ArrayList<>();
    HashMap<String, List<String>> frequentlySearchQueryList;

    public List<String> search(String query) {
        if (frequentlySearchQueryList.containsKey(query)) {
            return frequentlySearchQueryList.get(query);
        } else {
            List<String> ans = new ArrayList<String>();
            ans.add(query);
            return ans;
        }
    }
}
