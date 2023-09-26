package com.mabrouki.springbootbackfrontend.services;

import java.util.List;

import java.util.Optional;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabrouki.springbootbackfrontend.dto.ProductDto;
import com.mabrouki.springbootbackfrontend.models.CommandeProduct;
import com.mabrouki.springbootbackfrontend.models.CommandeProductPK;
import com.mabrouki.springbootbackfrontend.models.Product;
import com.mabrouki.springbootbackfrontend.repositories.CommandeProductsRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CommandeProductServiceImpl implements CommandeProductServiceInterface{

	private final CommandeProductsRepository commandeProductsRepository;

	@Override
	public void deleteProductFromCommande(int commandeId, int productId) {
		CommandeProductPK commandeProductPK =new CommandeProductPK(commandeId,productId);
		this.commandeProductsRepository.deleteById(commandeProductPK);
		
	}

	@Override
	public void updateQantiteCommandee(CommandeProduct commandeProduct, int commandeId, int productId) {
		CommandeProductPK commandeProductPK =new CommandeProductPK(commandeId,productId);
		Optional<CommandeProduct> commandeProduct1=this.commandeProductsRepository.findById(commandeProductPK);
		CommandeProduct commandeProduct2=commandeProduct1.get();
		commandeProduct2.setQuantite(commandeProduct.getQuantite());		
		commandeProductsRepository.save(commandeProduct2);
		
	}

	@Override
	public List<Product> getAllProductByCommande(int commandeId) {
		
		return commandeProductsRepository.findByCommande(commandeId);
	}

	@Override
	public List<ProductDto> getAllProductDtoByCommande(int commandeId) {
		
		return commandeProductsRepository.findByCommandeDto(commandeId);
	}

	@Override
	public void ajouterProdutToCommande(int commandeId, int productId) {
		// TODO Auto-generated method stub
		
	}

}
