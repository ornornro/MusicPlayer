package com.korit.karaoke.web.api;

import com.korit.karaoke.entity.UserMst;
import com.korit.karaoke.security.PrincipalDetails;
import com.korit.karaoke.service.AccountService;
import com.korit.karaoke.service.ModifyService;
import io.swagger.models.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/mypage")
public class ModifyApi {

    @Autowired
    private ModifyService modifyService;

    @PostMapping("/pwd_confirm")
    public ResponseEntity<Boolean> checkPassword(
            @AuthenticationPrincipal PrincipalDetails principalDetails,
            @RequestBody Map<String, String> checkPasswordMap) {
        return ResponseEntity
                .ok(modifyService.checkPassword(principalDetails.getUser(), checkPasswordMap.get("checkPassword")));
    }

}
