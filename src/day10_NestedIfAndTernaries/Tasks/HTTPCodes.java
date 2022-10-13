package day10_NestedIfAndTernaries.Tasks;

public class HTTPCodes {

    public static void main(String[] args) {
        // statusCode
        int s = 200;
        String result = (s == 200) ? "ok" : (s == 201) ? "created" : (s == 202) ? "accepted" : (s == 301) ?
                "moved permanently" : (s == 303) ? "see other" : (s == 304) ? "not modified" : (s == 307) ?
                "temporary redirect" : (s == 400) ? "bad request" : (s == 401) ? "unauthorized" : (s == 403) ?
                "forbidden" : (s == 404) ? "not found" : (s == 410) ? "gone" : (s == 500) ? "internal server error"
                : (s == 506) ? "service unavailable" :"NOT FOUND IN THE LIST";
        System.out.println("result = " + result);

    }
}
