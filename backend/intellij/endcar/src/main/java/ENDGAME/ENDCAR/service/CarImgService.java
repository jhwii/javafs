package ENDGAME.ENDCAR.service;

import ENDGAME.ENDCAR.entity.CarImg;
import ENDGAME.ENDCAR.repository.CarImgRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.StringUtils;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@Transactional
public class CarImgService {
    @Value("${carImgLocation}")
    private String carImgLocation;

    private final CarImgRepository carImgRepository;

    private final FileService fileService;

    public void saveCarImg(CarImg carImg, MultipartFile carImgFile)
            throws  Exception {
        String oriImgName = carImgFile.getOriginalFilename();
        String imgName = "";
        String imgUrl = "";
        // 파일 업로드
        if(!StringUtils.isEmpty(oriImgName)){
            imgName = fileService.uploadFile(carImgLocation, oriImgName,
                    carImgFile.getBytes());
            imgUrl = "/images/car/" + imgName;
        }

        // 상품 이미지 정보 저장
        carImg.updateCarImg(oriImgName, imgName, imgUrl);
        carImgRepository.save(carImg);
    }

    // SaveItemImg(ItemImg itemImg -  업로드된 이미지와 관련된 상품이미지 정보를 가진
    // ItemImg 객체입니다.
    // MultipartFile itemImgFile - 업로드할 상품 이미지 파일 나타내는 MultipartFile
    // oriImgFileName - 업로드된 이미지 파일의 원래 파일명을 저장

    // itemImg.updateItemImg(oriImgName, imgName, imgUrl);
    // 업로드된 이미지 파일의 원래 파일명, 저장된 파일명, 이미지 url을 업데이트
    // 업데이트된 상품 이미지 정보를 데이터 베이스에 저장
//    public void updateCarImg(Long carImgId, MultipartFile carImgFile) throws Exception{
//        if(!carImgFile.isEmpty()){
//            CarImg savedCarImg = CarImgRepository.findById(carImgId)
//                    .orElseThrow(EntityNotFoundException::new);
//
//            //기존 이미지 정보를 가져오기
//
//            //기존 이미지 파일 삭제
//            if(!StringUtils.isEmpty(savedCarImg.getImgName())) {
//                fileService.deleteFile(carImgLocation+"/"+
//                        savedCarImg.getImgName());
//            }
//
//            String oriImgName = carImgFile.getOriginalFilename();
//            //새로운 이미지 파일의 원본 파일 이름을 가져온다.
//            String imgName = fileService.uploadFile(carImgLocation, oriImgName, carImgFile.getBytes());
//            String imgUrl = "/images/car/" + imgName;
//
//
//            savedCarImg.updateCarImg(oriImgName, imgName, imgUrl);
//            //이미지 정보 엔티티의 필드를 업데이트 합니다.
//        }
//    }
}