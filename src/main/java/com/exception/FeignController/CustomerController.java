package com.exception.FeignController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.exception.Util.Cart;
import com.exception.Util.Product;
import com.exception.Util.Response;
import com.exception.entity.Customer;
import com.exception.service.CustomerService;



@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/customer",method = RequestMethod.POST)
	public ResponseEntity<Response> addCus(@RequestBody Cart cart ) {
//		Cart cart=new Cart();
		Response res=new Response();
//		res.setCustomer(customerService.getCustomerById(id));
		RestTemplate restTemplate=new RestTemplate();

		String endPoint="http://localhost:9898/addtocart";
		ResponseEntity<Cart>data=restTemplate.postForEntity(endPoint,cart,Cart.class );
		if(data.getStatusCodeValue()==200) {
			Cart crt=data.getBody();
			res.setCart(crt);

		}
		return new ResponseEntity<Response>(res,HttpStatus.OK);
	}


	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/customer/{id}",method = RequestMethod.GET)
	public ResponseEntity<Response> getProducts(@PathVariable Integer id) {
//		Cart c=new Cart();
		Response res=new Response();
//		res.setCustomer(customerService.getCustomerById(id));
		RestTemplate restTemplate=new RestTemplate();

		String endPoint="http://localhost:9898/Cart/{id}";
		ResponseEntity<Cart>data=restTemplate.getForEntity(endPoint,Cart.class,id);
		if(data.getStatusCodeValue()==200) {
			Cart crt=data.getBody();
			res.setCart(crt);
		}
		return new ResponseEntity<Response>(res,HttpStatus.OK);
	}
}


















































//
//int id1=res.getCart().getId();
//RestTemplate restTemplate=new RestTemplate();
//String url="http://localhost:9898/Cart/{id1}";
//ResponseEntity<Cart>data=restTemplate.getForEntity(url,Cart.class, id1);
//if(data.getStatusCodeValue()==200) {
//	Cart crt=data.getBody();
//	res.setCart(crt);
//}
