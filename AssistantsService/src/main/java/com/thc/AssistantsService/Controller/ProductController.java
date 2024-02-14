package com.thc.productservice.Controller;

import com.thc.productservice.Args.AddProductArgs;
import com.thc.productservice.Args.UpdateProductArgs;
import com.thc.productservice.Entity.Product;
import com.thc.productservice.Exception.Error;
import com.thc.productservice.Result.*;
import com.thc.productservice.Service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Product Controller", description = "Product management APIs")
@RestController
@CrossOrigin("*")
@RequestMapping("/api/v2/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Operation(
            summary = "Lấy toàn bộ sản phẩm",
            description = "Lấy toàn bộ sản phẩm",
            tags = {"Product Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListProductResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findAll")
    public ListProductResult listAll() {
        return new ListProductResult(productService.getAllProduct());
    }


    @Operation(
            summary = "Lấy sản phâm theo id",
            description = "Lấy sản phâm theo id",
            tags = {"Product Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ListByIdResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @GetMapping("/findById")
    public ListByIdResult findById(@RequestParam("id") String id) {
        return new ListByIdResult(productService.getProduct(id));
    }

    @Operation(
            summary = "Thêm sản phẩm",
            description = "Thêm sản phẩm",
            tags = {"Product Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = AddProductResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @PostMapping("/addProduct")
    public AddProductResult addCart(@RequestBody(required = true) AddProductArgs product) {
        return new AddProductResult(productService.createProduct(product));
    }

    @Operation(
            summary = "Cập nhật sản phẩm",
            description = "Cập nhật sản phẩm",
            tags = {"Product Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = UpdateProductResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")}),})
    @PutMapping("/updateProduct")
    public UpdateProductResult updateCart(@RequestBody(required = true) UpdateProductArgs product) {

        return new UpdateProductResult(productService.updateProduct(product));
    }

    @Operation(
            summary = "Xóa sản phẩm theo Id",
            description = "Xóa sản phẩm theo Id",
            tags = {"Product Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = DeleteByIdResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = Error.class), mediaType = "application/json")})})
    @DeleteMapping("/deleteById")
    public DeleteByIdResult deleteById(@RequestParam(value = "id") String id) {

        return new DeleteByIdResult(productService.deleteProduct(id));
    }

    @Operation(
            summary = "Xóa toàn bộ sản phẩm",
            description = "Xóa toàn bộ sản phẩm",
            tags = {"Product Controller"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = DeleteAllResult.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema())})})
    @DeleteMapping("/deleteAll")
    public DeleteAllResult deleteAll() {
        return new DeleteAllResult(productService.deleteProductAll());
    }
}
