package com.hyejineee.domain

class ObesityMeter {
    enum class Obesity{
        UnderWeight{
            override fun toString(): String {
                return "저체중"
            }
        },
        NormalWeight{
            override fun toString(): String {
                return "정상 체중"
            }
        },
        Overweight{
            override fun toString(): String {
                return "과체중"
            }
        },
        MildObesity{
            override fun toString(): String {
                return "경도 비만"
            }
        },
        ModerateObesity{
            override fun toString(): String {
                return "중정도 비만"
            }
        },
        SevereObesity{
            override fun toString(): String {
                return "고도 비"
            }
        }
    }

    fun measureObesity(bmi:Double):Obesity = when (bmi) {
            in 0.0..18.5 -> Obesity.UnderWeight
            in 18.6..23.0 -> Obesity.NormalWeight
            in 23.0..25.0 -> Obesity.Overweight
            in 26.0..30.0 -> Obesity.MildObesity
            in 31.0..35.0 -> Obesity.ModerateObesity
            else -> Obesity.SevereObesity
        }

}

