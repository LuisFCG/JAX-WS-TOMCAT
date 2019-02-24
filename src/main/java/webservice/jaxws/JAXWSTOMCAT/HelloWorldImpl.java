package webservice.jaxws.JAXWSTOMCAT;

import javax.jws.WebService;


@WebService(endpointInterface = "webservice.jaxws.JAXWSTOMCAT.HelloWorld")  
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String helloWorld(String name) {
		// TODO Auto-generated method stub
		return "Hola "+name;
	}

}
