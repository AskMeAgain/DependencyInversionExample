package what.ever;

import org.springframework.stereotype.Component;

@Component
public class Restapi implements RestapiInterface {

  public String getData() {
    return "data!";
  }
}
