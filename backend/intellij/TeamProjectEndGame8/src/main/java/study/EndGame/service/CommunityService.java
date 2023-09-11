package study.EndGame.service;

import org.springframework.stereotype.Service;
import study.EndGame.dto.CommunityDto;
import study.EndGame.entity.Community;
import study.EndGame.repository.CommunityRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CommunityService {
    private CommunityRepository communityRepository;

    public CommunityService(CommunityRepository communityRepository) {
        this.communityRepository = communityRepository;
    }

    @Transactional
    public Long savePost(CommunityDto communityDto) {
        return communityRepository.save(communityDto.toEntity()).getId();
    }

    @Transactional
    public List<CommunityDto> getCommunnityList() {
        List<Community> communityList = communityRepository.findAll();
        List<CommunityDto> communityDtoList = new ArrayList<>();

        for(Community community : communityList) {
            CommunityDto communityDto = CommunityDto.builder()
                    .id(community.getId())
                    .author(community.getAuthor())
                    .title(community.getTitle())
                    .content(community.getContent())
                    .createdDate(community.getCreatedDate())
                    .build();
            communityDtoList.add(communityDto);
        }
        return communityDtoList;
    }
}
