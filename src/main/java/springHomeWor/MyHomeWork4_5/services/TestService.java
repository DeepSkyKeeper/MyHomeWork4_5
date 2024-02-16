package springHomeWor.MyHomeWork4_5.services;


import java.util.HashMap;
import java.util.Map;

public class TestService {
    Map<String, Object> body;

    public boolean setObject(Map<String,Object> body){
        this.body=body;
        return true;
    }

    public Map<String, Object> getObject() {
        return body;
    }

    public Map<String,Object> getLower(){
        Map<String,Object> map =new HashMap<>();
        for(final Map.Entry<String,Object> pair: body.entrySet()){
            var value =pair.getValue();
            if (value instanceof String)
                value=((String) value).toLowerCase();
            map.put(pair.getKey(),value);
        }
        return map;
    }

    public Map<String,Object> getUpper(){
        Map<String,Object> map =new HashMap<>();
        for(final Map.Entry<String,Object> pair: body.entrySet()){
            var value =pair.getValue();
            if (value instanceof String)
                value=((String) value).toUpperCase();
            map.put(pair.getKey(),value);
        }
        return map;
    }
}
