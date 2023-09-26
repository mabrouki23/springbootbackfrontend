package com.mabrouki.springbootbackfrontend.services;

import java.util.List;

import com.mabrouki.springbootbackfrontend.dto.ProductDto;
import com.mabrouki.springbootbackfrontend.models.CommandeProduct;
import com.mabrouki.springbootbackfrontend.models.Product;


public interface CommandeProductServiceInterface {
void ajouterProdutToCommande(int commandeId,int productId);	
void deleteProductFromCommande(int commandeId,int productId);
void updateQantiteCommandee(CommandeProduct commandeProduct,int commandeId,int productId);
List<Product> getAllProductByCommande(int commandeId);
List<ProductDto> getAllProductDtoByCommande(int commandeId);
}
