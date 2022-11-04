package serverprograms;

public class HttpURLConnectionAPICall {

    public void APICall() {
        java.net.URL obj = null;
        try {
            obj = new java.net.URL("https://reqres.in/api/unknown");
            System.out.println("Its work");
        } catch (java.net.MalformedURLException e) {
            System.out.println("Url not found");
        }
        java.net.HttpURLConnection con = null;
        try {
            
            con = (java.net.HttpURLConnection) obj.openConnection();
            System.out.println("Its work");
        } catch (java.io.IOException e1) {
            System.out.println("");
        }
        java.io.BufferedReader read = null;
        try {
            
            System.out.println("Its work");
            read = new java.io.BufferedReader(new java.io.InputStreamReader(con.getInputStream()));
            System.out.println("word :"+read.readLine());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
