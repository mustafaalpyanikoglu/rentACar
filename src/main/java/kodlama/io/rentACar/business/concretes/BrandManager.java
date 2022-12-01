package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //BrandManager'ı otomatik newler ve program hep newlenen yerden referans alıp kullanır
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired //BrandRepositoy'i kimin implenet ettiğini buluyor yani -> InMemoryBrandRepository'i buluyor
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
