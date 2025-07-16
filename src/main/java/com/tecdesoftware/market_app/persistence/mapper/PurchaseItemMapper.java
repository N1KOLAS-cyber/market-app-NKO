package com.tecdesoftware.market_app.persistence.mapper;

import com.tecdesoftware.market_app.domain.PurchaseItem;
import com.tecdesoftware.market_app.persistence.entity.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {


    @Mappings({
            @Mapping(source = "id.idProducto", target = "productid"),
            @Mapping(source = "cantidad", target = "quantity"),
            // este no es necesario ya que se llaman igual: @Mapping(source = "total", target = "total"),
            @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(CompraProducto producto);
    //para el inverso
    @InheritInverseConfiguration
    //decirle que ignore los 3:
    @Mappings({
            @Mapping(target = "id.idCompra", ignore = true),
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
    })
    CompraProducto toCompraProducto(PurchaseItem item);
}