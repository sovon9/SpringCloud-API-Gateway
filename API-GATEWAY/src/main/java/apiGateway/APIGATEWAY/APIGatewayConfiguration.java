package apiGateway.APIGATEWAY;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIGatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder)
	{
		/**
		 * changes localhost:8282 to www.youtube.com + path
		 * so the url that it's  hitting is from http://localhost:8282/@abpanandatv
		 * to https://www.youtube.com/@abpanandatv
		 */
		return builder.routes().route(
				p -> p.path("/@abpanandatv")
				.uri("https://www.youtube.com/"))
				.build();
	}
	
	
}
