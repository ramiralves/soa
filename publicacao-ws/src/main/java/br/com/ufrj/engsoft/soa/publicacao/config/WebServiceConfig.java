package br.com.ufrj.engsoft.soa.publicacao.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ufrj.engsoft.soa.publicacao.soap.PublicacaoWs;



@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;
    
    @Autowired
    private PublicacaoWs publicacaoWs;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, publicacaoWs);
        endpoint.publish("/PublicacaoWS");
        return endpoint;
    }
    /*
    @Bean
    public ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean( new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    } 
    */   
}
