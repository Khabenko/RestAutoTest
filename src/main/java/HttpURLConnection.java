import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;

public class HttpURLConnection {

    // HTTP POST request
    public synchronized void EditHouseHoldRole(String param1) throws Exception {
        String url = "http://marketing-web/Tavriav790_T/ExternalProjects/ExternalAPI.WebApp/EditHouseHoldRole";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");
        post.setHeader("Authorization", "Basic U3VwZXJ2aXNvcjpTdXBlcnZpc29y");
        HashMap<String,String> map = new HashMap();
        map.put("MobilePhone","380981111111");
        map.put("BonusRoleType","1");
        map.put("CouponRoleType", "2");

        Gson gson = new Gson();
        StringEntity entity = new StringEntity(gson.toJson(map));

        String json = "{\"CouponRoleType\":\"2\",\"BonusRoleType\":\"1\",\"MobilePhone\":\"380981111111\"}";
        System.out.println(json.equals(gson.toJson(map)));
        //    entity = new StringEntity(json);

        System.out.println(gson.toJson(map));
        System.out.println(entity);

        post.setEntity(entity);
        System.out.println(post.getEntity().getContentType());
        System.out.println(post.getEntity());

        CloseableHttpResponse response = httpClient.execute(post);
        HttpEntity responseEntity = response.getEntity();
        System.out.println(response.getStatusLine());
        System.out.println(EntityUtils.toString(responseEntity));


    }


    public synchronized void EditSetPurchaseInfo(String param1) throws Exception {
        String url = "http://marketing-web/Tavriav790_T/ExternalProjects/ExternalAPI.WebApp/EditHouseHoldRole";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        post.setHeader("Accept", "application/json");
        post.setHeader("Content-type", "application/json");
        post.setHeader("Authorization", "Basic U3VwZXJ2aXNvcjpTdXBlcnZpc29y");



        String json = "{\n" +
                "\"PreprocessingId\": \"39e20392-bb5b-4a9a-ea62-fa1229eaa9d1\",\n" +
                " \"PurchaseNumber\": \"043\",\n" +
                " \"CardNumber\": \"29927585921\",\n" +
                " \"PointOfSaleCode\": \"3\",\n" +
                " \"Date\": \"2017-10-06 19:34\",\n" +
                " \"TotalAmount\": 15,\n" +
                " \"BonusesPaidAmount\": 0,\n" +
                " \"WriteOffBonusesAvaliable\": true,\n" +
                " \"Offline\": false,\n" +
                " \"IsReturn\": false,\n" +
                " \"CashierName\": \"Иванова\",\n" +
                " \"CashBox\": \"001_tavria\",\n" +
                " \"Products\": [\n" +
                "  {\n" +
                "   \"Position\": 1,\n" +
                "   \"ProductExtId\": \"product_02\",\n" +
                "   \"Quantity\": 1,\n" +
                "   \"Price\": 15,\n" +
                "   \"TotalPrice\": 11\n" +
                "}]\n" +
                "}";



        StringEntity  entity = new StringEntity(json);

        System.out.println(entity);

        post.setEntity(entity);
        System.out.println(post.getEntity().getContentType());
        System.out.println(post.getEntity());

        CloseableHttpResponse response = httpClient.execute(post);
        HttpEntity responseEntity = response.getEntity();
        System.out.println(response.getStatusLine());
        System.out.println(EntityUtils.toString(responseEntity));

    }








}