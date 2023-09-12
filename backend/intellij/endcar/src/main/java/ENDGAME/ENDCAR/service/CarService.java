package ENDGAME.ENDCAR.service;


import ENDGAME.ENDCAR.dto.CarFormDto;
import ENDGAME.ENDCAR.dto.CarImgDto;
import ENDGAME.ENDCAR.entity.Car;
import ENDGAME.ENDCAR.entity.CarImg;
import ENDGAME.ENDCAR.repository.CarImgRepository;
import ENDGAME.ENDCAR.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    private final CarImgService carImgService;

    private final CarImgRepository carImgRepository;

    public Long saveCar(CarFormDto carFormDto, List<MultipartFile> carImgFileList) throws Exception{

        //상품 등록
        Car car = carFormDto.createCar();
        carRepository.save(car);

        //이미지등록
        for(int i=0; i<carImgFileList.size();i++ ){
            CarImg carImg = new CarImg();
            carImg.setCar(car);//해당 이미지 객체에 상품 정보를 연결
            if(i == 0)
                carImg.setRepImgYn("Y"); //이미지넘버가 0 이면 대표이미지
            else
                carImg.setRepImgYn("N");
            carImgService.saveCarImg(carImg, carImgFileList.get(i));
        }
        return car.getId();
    }

    @Transactional(readOnly = true)
    public CarFormDto getCarDtl(Long carId){
        //상품 상세정보를 가져오는 메서드 선언
        List<CarImg> carImgList = carImgRepository.findByCarIdOrderByIdAsc(carId);
        // 해당상품에 연결된 이미지 정보를 id 순서대로 가져온다.
        List<CarImgDto> carImgDtoList = new ArrayList<>();
        //ItemImgDto 객체 리스트를 초기화합니다.
        for(CarImg carImg : carImgList)    {
            CarImgDto carImgDto = CarImgDto.of(carImg);
            // ItemImgDto 클래스에 정의된 of 메서드를 호출  ItemImg -> ItemImgDto 로 변환하여 반환
            carImgDtoList.add(carImgDto);
            //리스트에 추가
        }
        Car car = carRepository.findById(carId)
                .orElseThrow(EntityNotFoundException::new);
        // 해당 id의 상품정보를 데이터베이스에서 가져옵니다. 없으면 예외처리
        CarFormDto carFormDto = CarFormDto.of(car);
        //상품 정보를 ItemFormDto 로 변환합니다.
        carFormDto.setCarImgDtoList(carImgDtoList);
        //상품정보 Dto 에 이미지 정보 DTO 리스트를 설정
        return carFormDto;
    }
//    public Long updateCar(CarFormDto carFormDto, List<MultipartFile> carImgFileList) throws Exception{
//        //상품 수정
//        Car car = carRepository.findById(carFormDto.getId())
//                .orElseThrow(EntityNotFoundException::new);
//        car.updateCar(carFormDto);
//        List<Long> carImgIds= carFormDto.getCarImgIds();
//        // 이미지의 id 리스트를  가져와서 itemImgIds -> 이미지 업데이트나 관련작업(조회)
//
//        // 이미지 등록
//        for(int i=0 ; i <  carImgFileList.size(); i++){
//            carImgService.updateCarImg(carImgIds.get(i), carImgFileList.get(i));
//            //itemImgIds.get(i) -> 상품에 연결된 각이미지 id
//            //itemImgFileList.get(i) -> 새로운 이미지 파일
//        }
//        return car.getId();
//    }


//    @Transactional(readOnly = true)
//    public Page<Car> getAdminCarPage(CarSearchDto carSearchDto, Pageable pageable){
//        return carRepository.getAdminCarPage(carSearchDto, pageable);
//    }
//    @Transactional(readOnly = true)
//    public Page<MainCarDto> getMainCarPage(CarSearchDto carSearchDto, Pageable pageable){
//        return carRepository.getMainCarPage(carSearchDto, pageable);
//    }

}