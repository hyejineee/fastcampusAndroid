package com.hyejineee.domain

class CalculateBMIUseCase(
    private val bmiCalculator: BMICalculator = BMICalculator(),
    private val obesityMeter: ObesityMeter = ObesityMeter(),
    ) {


    /* *
    - 사용자로부터 키와 몸무게 정보를 입력받는다. -> 분리되어야 하는 역할
    - 사용자에게 계산 결과를 보여준다. -> 분리되어야 하는 역할
    - 사용자에겍 경고 문구를 보여준다. -> 분리되어야 하는 역할
    - 정보를 가지고 비만도와 체질량지수를 계산한다. -> 유스케이스의 역할?
    *  */

    private fun getBodyInfoFromUser(){

    }


}
