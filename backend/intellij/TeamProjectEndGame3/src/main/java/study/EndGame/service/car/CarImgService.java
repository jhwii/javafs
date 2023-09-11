package study.EndGame.service.car;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import study.EndGame.entity.CarImg;
import study.EndGame.repository.CarImgRepository;
import study.EndGame.service.FileService;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class CarImgService {

    @Value("${spring.carImgLocation}")
    private String carImgLocation;

    private final CarImgRepository carImgRepository;

    private final FileService fileService;

    public void saveCarImg(CarImg carImg, MultipartFile carImgFile)
            throws Exception{
        String oriImgName = carImgFile.getOriginalFilename();
        String imgName = "";
        String imgUrl = "";
        if(!StringUtils.isEmpty(oriImgName)){
            imgName = fileService.uploadFile(carImgLocation, oriImgName, carImgFile.getBytes());
            imgUrl = "/images/car/" + imgName;
        }

        carImg.updateCarImg(oriImgName, imgName, imgUrl);
        carImgRepository.save(carImg);
    }

    public void updateCarImg(Long carImgId, MultipartFile carImgFile) throws Exception{
        if(!carImgFile.isEmpty()){
            CarImg savedCarImg = carImgRepository.findById(carImgId)
                    .orElseThrow(EntityNotFoundException::new);

            if(!org.springframework.util.StringUtils.isEmpty(savedCarImg.getImgName())) {
                fileService.deleteFile(carImgLocation+"/"+
                        savedCarImg.getImgName());
            }

            String oriImgName = carImgFile.getOriginalFilename();

            String imgName = fileService.uploadFile(carImgLocation, oriImgName, carImgFile.getBytes());
            String imgUrl = "/images/car/" + imgName;

            savedCarImg.updateCarImg(oriImgName, imgName, imgUrl);
        }
    }
}
