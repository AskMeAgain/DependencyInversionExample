package what.ever;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ServiceA {

  private final RestapiInterface restapi;

  public ServiceA(RestapiInterface restapi) {
    this.restapi = restapi;
  }

  @PostConstruct
  void whatever() {
    System.out.println(restapi.getData());
  }
}
