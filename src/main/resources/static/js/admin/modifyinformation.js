window.onload = () => {
    userObj = PrincipalApi.getInstance().getPrincipal();
    HeaderService.getInstance().loadHeader();
    ModifyInformationService.getInstance().changeModifyInformation();
}

let userObj = null;

class ModifyInformationService {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new ModifyInformationService();
        }
        return this.#instance;
    }

    changeModifyInformation() {
        const informationContainer = document.querySelector(".information-container");

        console.log(informationContainer.innerHTML);

        informationContainer.innerHTML = `
            <div class="register-content">
                <div class="register-group">
                    <label for="register-name">성함</label>
                    <div class="input-group">
                        <input type="text" id="register-name" class="register-inputs" value="${userObj.user.name}">
                        <div class="register-error"></div>
                    </div>
                </div>
                <div class="register-group">
                    <label for="register-tel">연락처</label>
                    <div class="input-group">
                        <input type="text" id="register-tel" class="register-inputs" value="${userObj.user.phonenumber}">
                        <div class="register-error"></div>
                    </div>
                </div>
                <div class="register-group">
                    <label for="register-email">이메일</label>
                    <div class="input-group">
                        <input type="text" id="register-email" class="register-inputs" value="${userObj.user.email}">
                        <div class="register-error"></div>
                    </div>
                </div>

            </div>
            <button type="button" class="modify-submit">프로필 업데이트</button>
        `;
    }
}