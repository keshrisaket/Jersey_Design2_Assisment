package ServiceLayer;

import DataAccessLayer.ClientVerification;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ClientAuth {
    public static boolean validate(String authorizationHeader){
        String email = null;
        String pwd = null;
        // Check if the Authorization header is provided
        if (authorizationHeader != null && authorizationHeader.startsWith("Basic ")) {
            // Extract the base64-encoded part from the header
            String base64Credentials = authorizationHeader.substring("Basic".length()).trim();
            // Decode the credentials
            String credentials = new String(Base64.getDecoder().decode(base64Credentials), StandardCharsets.UTF_8);
            // credentials = username:password
            String[] values = credentials.split(":", 2);
            email = values[0];
            pwd = values[1];
        }

        if(ClientVerification.clientExist(email,pwd)){
            return true;
        }else {
            return false;
        }
    }
}
