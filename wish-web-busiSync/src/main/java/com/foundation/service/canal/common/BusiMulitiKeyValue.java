package com.foundation.service.canal.common;

import com.foundation.common.utils.Collections3;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fqh
 * @Description: 业务表复选框类型字段，枚举集合接口
 */
public interface BusiMulitiKeyValue {


    /**
     * 1睾丸炎、附睾炎，2精索静脉曲张，3不育症，4腮腺炎，5其他
     */
    enum Andropathy {
        orchitis(1, "睾丸炎、附睾炎", "orchitis"),
        his_varicocele(2, "精索静脉曲张", "his_varicocele"),
        infertility(3, "不育症", "infertility"),
        mumps(4, "腮腺炎", "mumps")/*,
        otherAndropathy(5,"男方其他患有不育症","other")*/;

        private Integer index;
        private String name;
        private String code;

        Andropathy(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static Andropathy getAndropathyByIndex(int index) {
            for (Andropathy andropathy : Andropathy.values()) {
                if (andropathy.getIndex().intValue() == index) {
                    return andropathy;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<Andropathy> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<Andropathy> list = Lists.newArrayList();
            for (Andropathy disease : Andropathy.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<Andropathy> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<Andropathy> list = Lists.newArrayList();
            for (Andropathy disease : Andropathy.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

    }

    /**
     * 女方患有子宫肌瘤
     * 1.先天性无子宫 2.幼稚子宫 3.双子宫 4.双角子宫5.子宫肌瘤 6.子宫腺肌症
     * 7.子宫内膜息肉 8.子宫腔粘连 9子宫内膜异位症10.子宫附件炎 11.卵巢囊肿 12.多囊卵巢综合征 13.输卵管积液 14.盆腔积液 99.其他
     */
    enum BDetail {
        /*xiantianxingwuzigong(1,"先天性无子宫","先天性无子宫"),
        youzhizigong(2,"幼稚子宫","幼稚子宫"),
        shuangzigong(3,"双子宫","双子宫"),
        shuangjiaozigong(4,"双角子宫","双角子宫"),*/
        uterine_fibroids(5, "子宫肌瘤", "uterine_fibroids"),
        /*zigongxianjizheng(6,"子宫腺肌症","子宫腺肌症"),
          zigongneimoxirou(7,"子宫内膜息肉","子宫内膜息肉"),
          zigongqiangnianlian(8,"子宫腔粘连","子宫腔粘连"),*/
        endometriosis(9, "子宫内膜异位症", "endometriosis")/*,
        zigongfujianyan(10,"子宫附件炎","子宫附件炎"),
        luanchaonangzong(11,"卵巢囊肿","卵巢囊肿"),
        duonangluanchaozonghezheng(12,"多囊卵巢综合征","多囊卵巢综合征"),
        shuluanguanjiye(13,"输卵管积液","输卵管积液"),
        penqiangjiye(14,"盆腔积液","盆腔积液"),
        otherBdetail(99,"其他","其他")*/;
        private Integer index;
        private String name;
        private String code;

        BDetail(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static BDetail getBDetailByIndex(Integer index) {
            for (BDetail b : BDetail.values()) {
                if (b.getIndex().intValue() == index) {
                    return b;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<BDetail> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<BDetail> list = Lists.newArrayList();
            for (BDetail disease : BDetail.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<BDetail> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<BDetail> list = Lists.newArrayList();
            for (BDetail disease : BDetail.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }
    }

    /**
     * 家庭疾病类型
     * 1.地中海贫血，2.白化病，3.蚕豆病（G6PD缺乏症），4.血友病，5.先天性心脏病，6.唐氏综合征，7.糖尿病，8.先天性智力低下，9.听力障碍（10岁以内发生）
     * 10.视力障碍（10岁以内发生），11.新生儿或婴幼儿死亡，12.其他出生缺陷
     */
    enum FamilyDisease {
        dizhonghaipinxue(1, "家族成员是否患有地中海贫血", "mediterranean_anemia"),
        baihuabing(2, "家族成员是否患有白化病", "albino"),
        chandoubing(3, "家族成员是否患有蚕豆病（G6PD缺乏症）", "g6pd"),
        xueyoubing(4, "家族成员是否患有血友病", "hemophilia"),
        xiantianxingxinxinzhangbing(5, "家族成员是否患有先天性心脏病", "al_heart_disease"),
        tangshizonghezheng(6, "家族成员是否患有唐氏综合症", "syndrome"),
        tangniaobing(7, "家族成员是否患有糖尿病家族史", "family_diabetes"),
        xiantianxingzhilidixia(8, "家族成员是否先天性智力低下", "mental_low"),
        tinglizhangai(9, "家族成员有人患有听力障碍", "hear_low"),
        shilizhangai(10, "家族成员是否患有视力障碍", "vision_low"),
        xinshengerhuoyingyouersiwang(11, "家族成员是否在新生儿期或婴幼儿期死亡", "child_dead"),
        otherDisease(12,"家族成员是否患有其他出生缺陷","is_other_family_disease");

        private Integer index;
        private String name;
        private String code;

        FamilyDisease(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static FamilyDisease getFamilyDiseaseByIndex(int index) {
            for (FamilyDisease disease : FamilyDisease.values()) {
                if (disease.getIndex().intValue() == index) {
                    return disease;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<FamilyDisease> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<FamilyDisease> list = Lists.newArrayList();
            for (FamilyDisease disease : FamilyDisease.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<FamilyDisease> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<FamilyDisease> list = Lists.newArrayList();
            for (FamilyDisease disease : FamilyDisease.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }
    }

    /**
     * 1.子宫附件炎症 2.不孕不育症
     */
    enum Gynecopathy {

        uterus_inflammation(1, "子宫附件炎症", "uterus_inflammation"),
        infertility(2, "不孕不育症", "infertility");
        private Integer index;
        private String name;
        private String code;

        Gynecopathy(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static Gynecopathy getQynecopathyByIndex(Integer index) {
            for (Gynecopathy b : Gynecopathy.values()) {
                if (b.getIndex().intValue() == index) {
                    return b;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<Gynecopathy> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<Gynecopathy> list = Lists.newArrayList();
            for (Gynecopathy disease : Gynecopathy.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取选中的复选框，并且返回
         */
        public static List<Gynecopathy> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<Gynecopathy> list = Lists.newArrayList();
            for (Gynecopathy disease : Gynecopathy.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }
    }

    /**
     * 1．放射线，2.高温，3.噪音，4.有机溶剂（如新装修、油漆等），5.密切接触猫狗等家畜、宠物，6.振动，7.重金属（铅、汞等）8.农药，9.其他
     */
    enum HarmfulEnvironment {
        radiation(1, "放射线", "radiation"),
        high_temperature(2, "高温", "high_temperature"),
        noise(3, "噪音", "noise"),
        Organic_solvent(4, "有机溶剂（如新装修、油漆等）", "organic_solvent"),
        pet(5, "密切接触猫狗等家畜、宠物", "pet"),
        vibration(6, "振动", "vibration"),
        Heavy_metal(7, "重金属（铅、汞等）", "heavy_metal"),
        pesticide(8, "农药", "pesticide"),
        is_other_harmful_environment(99,"是否接触其他毒害物质","is_other_harmful_environment");

        private Integer index;
        private String name;
        private String code;

        HarmfulEnvironment(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static HarmfulEnvironment getHarmfulEnvironmentByIndex(Integer index) {
            for (HarmfulEnvironment b : HarmfulEnvironment.values()) {
                if (b.getIndex().intValue() == index) {
                    return b;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<HarmfulEnvironment> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<HarmfulEnvironment> list = Lists.newArrayList();
            for (HarmfulEnvironment disease : HarmfulEnvironment.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取选中的复选框，并且返回
         */
        public static List<HarmfulEnvironment> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<HarmfulEnvironment> list = Lists.newArrayList();
            for (HarmfulEnvironment disease : HarmfulEnvironment.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }
    }

    /**
     * 1.妊娠期糖尿病史 2.妊娠期高血压疾病史
     */
    enum PreDiseaseValue {
        pre_diabetes(1, "妊娠期糖尿病史", "pre_diabetes"),
        pre_high_blood(2, "妊娠期高血压疾病史", "pre_high_blood");
        private Integer index;
        private String name;
        private String code;

        PreDiseaseValue(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static PreDiseaseValue getPreDiseaseValueByIndex(Integer index) {
            for (PreDiseaseValue b : PreDiseaseValue.values()) {
                if (b.getIndex().intValue() == index) {
                    return b;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<PreDiseaseValue> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<PreDiseaseValue> list = Lists.newArrayList();
            for (PreDiseaseValue disease : PreDiseaseValue.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取选中的复选框，并且返回
         */
        public static List<PreDiseaseValue> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<PreDiseaseValue> list = Lists.newArrayList();
            for (PreDiseaseValue disease : PreDiseaseValue.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

    }

    /**
     * 1贫血、2高血压、3心脏病、4糖尿病、5癫痫、6甲状腺病、7慢性肾炎、8肿瘤、9结核、10乙型肝炎、11淋病/梅毒/衣原体感染等，12精神心理疾患等
     */
    enum SufferedDisease {
        anemia(1, "贫血", "anemia"),
        High_blood(2, "高血压", "high_blood"),
        heart_disease(3, "心脏病", "heart_disease"),
        diabetes(4, "糖尿病", "diabetes"),
        epilepsy(5, "癫痫", "epilepsy"),
        thyropathy(6, "甲状腺病", "thyropathy"),
        nephritis(7, "慢性肾炎", "nephritis"),//--------
        tumor(8, "肿瘤", "tumor"),
        tuberculosis(9, "结核", "tuberculosis"),
        hepatitis(10, "乙型肝炎", "hepatitis"),
        /*luanchaonangzong(11,"淋病/梅毒/衣原体感染等","淋病/梅毒/衣原体感染"),*/
        disorders(12, "精神心理疾患", "disorders");
        private Integer index;
        private String name;
        private String code;

        SufferedDisease(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static SufferedDisease getSufferedDiseaseByIndex(Integer index) {
            for (SufferedDisease b : SufferedDisease.values()) {
                if (b.getIndex().intValue() == index) {
                    return b;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<SufferedDisease> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<SufferedDisease> list = Lists.newArrayList();
            for (SufferedDisease disease : SufferedDisease.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取选中的复选框，并且返回
         */
        public static List<SufferedDisease> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<SufferedDisease> list = Lists.newArrayList();
            for (SufferedDisease disease : SufferedDisease.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }
    }


    /**
     * 智力枚举
     */
    enum Intelligence {
        common(1, "常识（智力异常类型）", "common"),
        judge(2, "判断（智力异常类型）", "judge"),
        memory(3, "记忆（智力异常类型）", "memory"),
        calculation(4, "计算（智力异常类型）", "calculation");
        private Integer index;
        private String name;
        private String code;

        Intelligence(Integer index, String name, String code) {
            this.index = index;
            this.name = name;
            this.code = code;
        }

        public Integer getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public String getCode() {
            return code;
        }

        public static Intelligence getIntelligenceByIndex(Integer index) {
            for (Intelligence b : Intelligence.values()) {
                if (b.getIndex().intValue() == index) {
                    return b;
                }
            }
            return null;
        }

        /**
         * 获取没有选中的复选框，并且返回
         */
        public static List<Intelligence> getUncheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<Intelligence> list = Lists.newArrayList();
            for (Intelligence disease : Intelligence.values()) {
                if (!Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }

        /**
         * 获取选中的复选框，并且返回
         */
        public static List<Intelligence> getCheckedByIndex(String[] vals) {
            if (vals == null || vals.length == 0) {
                return null;
            }
            List<Intelligence> list = Lists.newArrayList();
            for (Intelligence disease : Intelligence.values()) {
                if (Collections3.isCheckedByIndex(vals, disease.getIndex().toString())) {
                    list.add(disease);
                }
            }
            return list;
        }
    }

}
