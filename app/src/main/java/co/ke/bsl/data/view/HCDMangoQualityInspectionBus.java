package co.ke.bsl.data.view;

public class HCDMangoQualityInspectionBus {

    private static HCDMangoQualityInspectionBus single_instance = null;

    private HCDMangoQualityInspectionBus() {
    }

    public static HCDMangoQualityInspectionBus getInstance() {
        if (single_instance == null)
            single_instance = new HCDMangoQualityInspectionBus();

        return single_instance;
    }

    public static HCDMangoQualityInspectionBus getSingle_instance() {
        return single_instance;
    }

    public static void setSingle_instance(HCDMangoQualityInspectionBus single_instance) {
        HCDMangoQualityInspectionBus.single_instance = single_instance;
    }

    private String documentNumber;
    private String dosumentdate;
    private String inspectionRequestNo;
    private String exportersName;
    private String exportersAgentName;
    private String sizeOfConsignment;
    private String localID;
    private String isLatexstains;
    private String latexStainsRemarks;
    private String isyellow;
    private String isgreen;
    private String isfleshYellow;
    private String isfleshWhitesh;
    private String isfleshFirmness;
    private String fleshColorRemarks;
    private String iswoundDamage;
    private String woundDamageRemarks;
    private String isdiscoloration;
    private String discolorationRemarks;
    private String isStalkpressure;
    private String stalkPressureRemarks;
    private String fruitSizing;
    private String isvariety;
    private String varietyRemarks;
    private String ishassFleshColorCreamy;
    private String colorRemarks;
    private String issize;
    private String sizeRemarks;
    private String isforeignMatterpresen;
    private String foreignMatterPresentRemarks;
    private String isMoistureonFruits;
    private String moistureonFruitsRemarks;
    private String isLostHarvesttreatment;
    private String lostHarvesttreatmentRemarks;
    private String comments;
    private String officerrecommendation;
    private String officerrecommendation_remark;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDosumentdate() {
        return dosumentdate;
    }

    public void setDosumentdate(String dosumentdate) {
        this.dosumentdate = dosumentdate;
    }

    public String getInspectionRequestNo() {
        return inspectionRequestNo;
    }

    public void setInspectionRequestNo(String inspectionRequestNo) {
        this.inspectionRequestNo = inspectionRequestNo;
    }

    public String getExportersName() {
        return exportersName;
    }

    public void setExportersName(String exportersName) {
        this.exportersName = exportersName;
    }

    public String getExportersAgentName() {
        return exportersAgentName;
    }

    public void setExportersAgentName(String exportersAgentName) {
        this.exportersAgentName = exportersAgentName;
    }

    public String getSizeOfConsignment() {
        return sizeOfConsignment;
    }

    public void setSizeOfConsignment(String sizeOfConsignment) {
        this.sizeOfConsignment = sizeOfConsignment;
    }

    public String getLocalID() {
        return localID;
    }

    public void setLocalID(String localID) {
        this.localID = localID;
    }

    public String getIsLatexstains() {
        return isLatexstains;
    }

    public void setIsLatexstains(String isLatexstains) {
        this.isLatexstains = isLatexstains;
    }

    public String getLatexStainsRemarks() {
        return latexStainsRemarks;
    }

    public void setLatexStainsRemarks(String latexStainsRemarks) {
        this.latexStainsRemarks = latexStainsRemarks;
    }

    public String getIsyellow() {
        return isyellow;
    }

    public void setIsyellow(String isyellow) {
        this.isyellow = isyellow;
    }

    public String getIsgreen() {
        return isgreen;
    }

    public void setIsgreen(String isgreen) {
        this.isgreen = isgreen;
    }

    public String getIsfleshYellow() {
        return isfleshYellow;
    }

    public void setIsfleshYellow(String isfleshYellow) {
        this.isfleshYellow = isfleshYellow;
    }

    public String getIsfleshWhitesh() {
        return isfleshWhitesh;
    }

    public void setIsfleshWhitesh(String isfleshWhitesh) {
        this.isfleshWhitesh = isfleshWhitesh;
    }

    public String getIsfleshFirmness() {
        return isfleshFirmness;
    }

    public void setIsfleshFirmness(String isfleshFirmness) {
        this.isfleshFirmness = isfleshFirmness;
    }

    public String getFleshColorRemarks() {
        return fleshColorRemarks;
    }

    public void setFleshColorRemarks(String fleshColorRemarks) {
        this.fleshColorRemarks = fleshColorRemarks;
    }

    public String getIswoundDamage() {
        return iswoundDamage;
    }

    public void setIswoundDamage(String iswoundDamage) {
        this.iswoundDamage = iswoundDamage;
    }

    public String getWoundDamageRemarks() {
        return woundDamageRemarks;
    }

    public void setWoundDamageRemarks(String woundDamageRemarks) {
        this.woundDamageRemarks = woundDamageRemarks;
    }

    public String getIsdiscoloration() {
        return isdiscoloration;
    }

    public void setIsdiscoloration(String isdiscoloration) {
        this.isdiscoloration = isdiscoloration;
    }

    public String getDiscolorationRemarks() {
        return discolorationRemarks;
    }

    public void setDiscolorationRemarks(String discolorationRemarks) {
        this.discolorationRemarks = discolorationRemarks;
    }

    public String getIsStalkpressure() {
        return isStalkpressure;
    }

    public void setIsStalkpressure(String isStalkpressure) {
        this.isStalkpressure = isStalkpressure;
    }

    public String getStalkPressureRemarks() {
        return stalkPressureRemarks;
    }

    public void setStalkPressureRemarks(String stalkPressureRemarks) {
        this.stalkPressureRemarks = stalkPressureRemarks;
    }

    public String getFruitSizing() {
        return fruitSizing;
    }

    public void setFruitSizing(String fruitSizing) {
        this.fruitSizing = fruitSizing;
    }

    public String getIsvariety() {
        return isvariety;
    }

    public void setIsvariety(String isvariety) {
        this.isvariety = isvariety;
    }

    public String getVarietyRemarks() {
        return varietyRemarks;
    }

    public void setVarietyRemarks(String varietyRemarks) {
        this.varietyRemarks = varietyRemarks;
    }

    public String getIshassFleshColorCreamy() {
        return ishassFleshColorCreamy;
    }

    public void setIshassFleshColorCreamy(String ishassFleshColorCreamy) {
        this.ishassFleshColorCreamy = ishassFleshColorCreamy;
    }

    public String getColorRemarks() {
        return colorRemarks;
    }

    public void setColorRemarks(String colorRemarks) {
        this.colorRemarks = colorRemarks;
    }

    public String getIssize() {
        return issize;
    }

    public void setIssize(String issize) {
        this.issize = issize;
    }

    public String getSizeRemarks() {
        return sizeRemarks;
    }

    public void setSizeRemarks(String sizeRemarks) {
        this.sizeRemarks = sizeRemarks;
    }

    public String getIsforeignMatterpresen() {
        return isforeignMatterpresen;
    }

    public void setIsforeignMatterpresen(String isforeignMatterpresen) {
        this.isforeignMatterpresen = isforeignMatterpresen;
    }

    public String getForeignMatterPresentRemarks() {
        return foreignMatterPresentRemarks;
    }

    public void setForeignMatterPresentRemarks(String foreignMatterPresentRemarks) {
        this.foreignMatterPresentRemarks = foreignMatterPresentRemarks;
    }

    public String getIsMoistureonFruits() {
        return isMoistureonFruits;
    }

    public void setIsMoistureonFruits(String isMoistureonFruits) {
        this.isMoistureonFruits = isMoistureonFruits;
    }

    public String getMoistureonFruitsRemarks() {
        return moistureonFruitsRemarks;
    }

    public void setMoistureonFruitsRemarks(String moistureonFruitsRemarks) {
        this.moistureonFruitsRemarks = moistureonFruitsRemarks;
    }

    public String getIsLostHarvesttreatment() {
        return isLostHarvesttreatment;
    }

    public void setIsLostHarvesttreatment(String isLostHarvesttreatment) {
        this.isLostHarvesttreatment = isLostHarvesttreatment;
    }

    public String getLostHarvesttreatmentRemarks() {
        return lostHarvesttreatmentRemarks;
    }

    public void setLostHarvesttreatmentRemarks(String lostHarvesttreatmentRemarks) {
        this.lostHarvesttreatmentRemarks = lostHarvesttreatmentRemarks;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getOfficerrecommendation() {
        return officerrecommendation;
    }

    public void setOfficerrecommendation(String officerrecommendation) {
        this.officerrecommendation = officerrecommendation;
    }

    public String getOfficerrecommendation_remark() {
        return officerrecommendation_remark;
    }

    public void setOfficerrecommendation_remark(String officerrecommendation_remark) {
        this.officerrecommendation_remark = officerrecommendation_remark;
    }
}
