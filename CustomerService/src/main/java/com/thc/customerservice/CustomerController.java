package com.thc.customerservice;

import com.thc.customerservice.Entity.Customer;
import com.thc.customerservice.Services.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "Customer Controller", description = "Customer management APIs")
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v2/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


//    @Operation(
//            summary = "Lấy toàn bộ sản phẩm",
//            description = "Lấy toàn bộ sản phẩm",
//            tags = {"Product Controller"})
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListProductResult.class), mediaType = "application/json")}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findAll")
    public List<Customer> listAll() {
        return customerService.getAllCustomer();
    }
}
