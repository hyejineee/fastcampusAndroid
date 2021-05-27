package com.hyejineee.domain

import io.kotest.core.spec.style.DescribeSpec

class CalculateBMIUseCaseTest:DescribeSpec({

    describe("CalculateBMIUseCase"){
//        context("사용자가 키와 체중을 입력하고 계산하기 버튼을 누르면"){
//            it("BMI 수치와 비만도를 알 수 있다."){
//
//            }
//        }
        // 유스케이스와 유저스토리를 구분할 . 유스케이스는 애플리케이션 업무와 관련된 것을 기술하는 것


        context("키와 체중을 입력하고 계산을 하면"){
            it("BMI수치와 비만도를 볼수 있다."){
                // 프레젠터 레이어를 테스트해야 하나...

            }
        }

        context("키 또는 체중 하나만 입력했을 경우"){
            it("키 또는 체중을 입력하라는 경고 문구를 볼 수 있다."){

            }
        }

    }
})