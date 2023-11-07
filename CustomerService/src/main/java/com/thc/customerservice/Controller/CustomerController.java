package com.thc.customerservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thc.customerservice.Args.FindByIdArgs;
import com.thc.customerservice.Args.FindByPhoneArgs;
import com.thc.customerservice.Args.ListAllCustomerArgs;
import com.thc.customerservice.Requests.FindByPhoneRequest;
import com.thc.customerservice.Requests.ListAllCustomerRequest;
import com.thc.customerservice.Requests.ListByIdRequest;
import com.thc.customerservice.Response.FindByPhoneResponse;
import com.thc.customerservice.Response.ListAllCustomerResponse;
import com.thc.customerservice.Response.ListByIdResponse;
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
            summary = "Lấy toàn bộ xe đẩy",
            description = "Lấy toàn bộ xe đẩy",
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
            summary = "Lấy xe đẩy theo id",
            description = "Lấy xe đẩy theo id",
            tags = {"Customer Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListByIdResponse.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findById")
    public ListByIdResponse findById(ListByIdRequest request){
    	FindByIdArgs args = new FindByIdArgs(request);
        return new ListByIdResponse(customerService.getCustomer(args.getId()));

    }

    @Operation(
            summary = "Lấy xe đẩy theo id",
            description = "Lấy xe đẩy theo id",
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
//
//    @Operation(
//            summary = "Thêm xe đẩy",
//            description = "Thêm xe đẩy",
//            tags = {"Customer Controller"})
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = AddCartResult.class), mediaType = "application/json")}),
//            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema())}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
//    @PostMapping("/addCart")
//    public AddCartResult addCart(@RequestBody(required = true) AddCartArgs cart) {
//        return new AddCartResult(cartService.createCart(cart));
//    }
//
//    @Operation(
//            summary = "Cập nhật xe đẩy",
//            description = "Cập nhật xe đẩy",
//            tags = {"Cart Controller"})
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = UpdateCartResult.class), mediaType = "application/json")}),
//            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),})
//    @PutMapping("/updateCart")
//    public UpdateCartResult updateCart(@RequestBody(required = true) UpdateCartArgs cart){
//
//        return new UpdateCartResult(cartService.updateCart(cart));
//    }
//
//    @Operation(
//            summary = "Xóa xe đẩy theo Id",
//            description = "Xóa xe đẩy theo Id",
//            tags = {"Cart Controller"})
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = DeleteByIdResult.class), mediaType = "application/json")}),
//            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")})})
//    @DeleteMapping("/deleteById")
//    public DeleteByIdResult deleteById(@RequestParam(value = "id") String id) {
//
//        return new DeleteByIdResult(cartService.deleteCart(id));
//    }
//
//    @Operation(
//            summary = "Xóa toàn bộ xe đẩy",
//            description = "Xóa toàn bộ xe đẩy",
//            tags = {"Cart Controller"})
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = DeleteAllResult.class), mediaType = "application/json")}),
//            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
//    @DeleteMapping("/deleteAll")
//    public DeleteAllResult deleteAll() {
//        return new DeleteAllResult(cartService.deleteCartAll());
//    }
}
