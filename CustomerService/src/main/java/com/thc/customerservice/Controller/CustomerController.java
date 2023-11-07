package com.thc.customerservice.Controller;

import com.thc.customerservice.Args.*;
import com.thc.customerservice.Requests.*;
import com.thc.customerservice.Response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.thc.customerservice.Services.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Customer Controller", description = "Customer management APIs")
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v2/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @Operation(
            summary = "Lấy toàn bộ khach hang",
            description = "Lấy toàn bộ khach hang",
            tags = {"Customer Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListAllCustomerResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findAll")
    public ListAllCustomerResponse listCustomer(ListAllCustomerRequest request) {
        ListAllCustomerArgs args = new ListAllCustomerArgs(request);
        return new ListAllCustomerResponse(customerService.getAllCustomer(args));
    }

    @Operation(
            summary = "Lấy khach hang theo id",
            description = "Lấy khach hang theo id",
            tags = {"Customer Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListByIdResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findById")
    public ListByIdResponse findById(ListByIdRequest request){
    	FindByIdArgs args = new FindByIdArgs(request);
        return new ListByIdResponse(customerService.getCustomer(args));

    }

    @Operation(
            summary = "Lấy khach hang theo id",
            description = "Lấy khach hang theo id",
            tags = {"Customer Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = FindByPhoneResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findByPhone")
    public FindByPhoneResponse findByPhone(FindByPhoneRequest request){
    	FindByPhoneArgs args = new FindByPhoneArgs(request);
        return new FindByPhoneResponse(customerService.getCustomerByPhone(args));

    }

    @Operation(
            summary = "Thêm khach hang",
            description = "Thêm khach hang",
            tags = {"Customer Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = AddCustomerResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @PostMapping("/addCustomer")
    public AddCustomerResponse addCart(@RequestBody(required = true) AddCustomerRequest request) {
        AddCustomerArgs args = new AddCustomerArgs(request);
        return new AddCustomerResponse(customerService.createCart(args));
    }

    @Operation(
            summary = "Cập nhật khach hang",
            description = "Cập nhật khach hang",
            tags = {"Customer Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = UpdateCustomerResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),})
    @PutMapping("/updateCustomer")
    public UpdateCustomerResponse updateCart(@RequestBody(required = true) UpdateCustomerRequest request){
        UpdateCustomerArgs args = new UpdateCustomerArgs(request);
        return new UpdateCustomerResponse(customerService.updateCustomer(args));
    }

    @Operation(
            summary = "Cập nhật diem khach hang",
            description = "Cập nhật điểm khach hang",
            tags = {"Customer Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = UpdateCustomerResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),})
    @PutMapping("/updateCustomerByPhone")
    public UpdateCustomerByPhoneResponse updateCartByPhone(@RequestBody(required = true) UpdateCustomerByPhoneRequest request){
        UpdateCustomerByPhoneArgs args = new UpdateCustomerByPhoneArgs(request);
        return new UpdateCustomerByPhoneResponse(customerService.updateCustomerByPhone(args));
    }

    @Operation(
            summary = "Xóa xe đẩy theo Id",
            description = "Xóa xe đẩy theo Id",
            tags = {"Cart Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = DeleteCustomerResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")})})
    @DeleteMapping("/deleteById")
    public DeleteCustomerResponse deleteById(DeleteCustomerRequest request) {
        DeleteCustomerArgs args = new DeleteCustomerArgs(request);
        return new DeleteCustomerResponse(customerService.deleteCustomer(args));
    }
}
