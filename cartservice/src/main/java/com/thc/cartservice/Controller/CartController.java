package com.thc.cartservice.Controller;

import com.thc.cartservice.Args.AddCartArgs;
import com.thc.cartservice.Args.UpdateCartArgs;
import com.thc.cartservice.Exception.CartNotFoundException;
import com.thc.cartservice.Exception.Error;
import com.thc.cartservice.Resutls.*;
import com.thc.cartservice.Service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Cart Controller", description = "Cart management APIs")
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v2/cart")
public class CartController {

    @Autowired
    private CartService cartService;


    @Operation(
            summary = "Lấy toàn bộ xe đẩy",
            description = "Lấy toàn bộ xe đẩy",
            tags = {"Cart Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListCartResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findAll")
    public ListCartResult listCart() {
        return new ListCartResult(cartService.getAllCart());
    }

    @Operation(
            summary = "Lấy xe đẩy theo id",
            description = "Lấy xe đẩy theo id",
            tags = {"Cart Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListByIdResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findById")
    public ListByIdResult listCart(@RequestParam(value = "id") String id){

        return new ListByIdResult(cartService.getCart(id));

    }

    @Operation(
            summary = "Thêm xe đẩy",
            description = "Thêm xe đẩy",
            tags = {"Cart Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = AddCartResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @PostMapping("/addCart")
    public AddCartResult addCart(@RequestBody(required = true) AddCartArgs cart) {
        return new AddCartResult(cartService.createCart(cart));
    }

    @Operation(
            summary = "Cập nhật xe đẩy",
            description = "Cập nhật xe đẩy",
            tags = {"Cart Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = UpdateCartResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),})
    @PutMapping("/updateCart")
    public UpdateCartResult updateCart(@RequestBody(required = true) UpdateCartArgs cart){

        return new UpdateCartResult(cartService.updateCart(cart));
    }

    @Operation(
            summary = "Xóa xe đẩy theo Id",
            description = "Xóa xe đẩy theo Id",
            tags = {"Cart Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = DeleteByIdResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")})})
    @DeleteMapping("/deleteById")
    public DeleteByIdResult deleteById(@RequestParam(value = "id") String id) {

        return new DeleteByIdResult(cartService.deleteCart(id));
    }

    @Operation(
            summary = "Xóa toàn bộ xe đẩy",
            description = "Xóa toàn bộ xe đẩy",
            tags = {"Cart Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = DeleteAllResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @DeleteMapping("/deleteAll")
    public DeleteAllResult deleteAll() {
        return new DeleteAllResult(cartService.deleteCartAll());
    }


}
