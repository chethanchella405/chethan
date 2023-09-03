package mytest;
import static nginx.clojure.MiniConstants.*;
import java.util.HashMap;
import java.util.Map;

public  class Hello implements NginxJavaRingHandler {

   @Override
   public Object[] invoke(Map<String, Object> request) {
       return new Object[] {
                      NGX_HTTP_OK, //http status 200
                      ArrayMap.create(CONTENT_TYPE, "text/plain"), //headers map
                      "Hello, Java & NGINX!"  //response body can be string, File or Array/Collection of them
                  }
   }
}
