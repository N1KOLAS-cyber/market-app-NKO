package com.tecdesoftware.market_app.persistence.mapper;

import com.tecdesoftware.market_app.domain.PurchaseItem;
import com.tecdesoftware.market_app.persistence.entity.CompraProducto;
import org.mapstruct.*;

@Mapper (componentModel = "spring")
public interface PurchaseItemMapper {
    @Mappings({
            @Mapping(source = "id.", target = "Productid"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "estado", target = "active"),

    })
    PurchaseItem toPurchaseItem(CompraProducto producto);

    @InheritInverseConfiguration
    @Mappings(
            @Mapping(target = "id.idcompra"),
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "compraProductos"), ignore = true),
    );

}
