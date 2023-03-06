window.onload = () => {
    PrincipalApi.getInstance().getPrincipal();
    HeaderService.getInstance().loadHeader();
    ModifyPasswordService.getInstance().changeModifyPassword();
}

class ModifyPasswordService {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new ModifyPasswordService();
        }
        return this.#instance;
    }

    changeModifyPassword() {
        const passwordContainer = document.querySelector(".password-container");

        console.log(passwordContainer.innerHTML);

        passwordContainer.innerHTML = `
                <div class="register-content">
                <div class="register-group">
                    <label for="register-password">현재 비밀번호</label>
                    <div class="input-group">
                        <input type="text" id="register-password" class="register-inputs">
                        <div class="register-error"></div>
                    </div>
                </div>
                <div class="register-group">
                    <label for="register-newpassword">새로운 비밀번호</label>
                    <div class="input-group">
                        <input type="text" id="register-newpassword" class="register-inputs">
                        <div class="register-error"></div>
                    </div>
                </div>
                <div class="register-group">
                    <label for="register-newpassword">새로운 비밀번호 확인</label>
                    <div class="input-group">
                        <input type="text" id="register-newpassword" class="register-inputs">
                        <div class="register-error"></div>
                    </div>
                </div>

            </div>
            <button type="button" class="modify-submit">비밀번호 변경 완료</button>
        `;
    }
}