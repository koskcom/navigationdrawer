package co.ke.bsl.data.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class HCDParkhouseWarehouse {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int hcdParkhouseWarehouse_id;
    private String documentNumber;
    private String documentDate;
    private String dealerCategory;
    private String nameOfApplicant;
    private String telephone;
    private String email;
    private String county;
    private String location;
    private String produceCrops;
    private String exportLicence;
    private String localID;
    private String name;
    private String tel;
    private String location2;
    private String licenceNumber;
    private String isCertificationtoSafetyStandards;
    private String certificationToSafetyStandardsRemarks;
    private String isDulysignedExporter;
    private String dulySignedExporterRemarks;
    private String isListandCodes;
    private String listAndCodesRemarks;
    private String isRegisterofIncomingProduce;
    private String registerOfIncomingProduceRemarks;
    private String isAreproduceAndSourcesDeclared;
    private String areProduceAndSourcesDeclaredRemarks;
    private String isCopiesofProduceCollection;
    private String copiesOfProduceCollectionRemarks;
    private String isHarvestdateAndQuantity;
    private String harvestDateAndQuantityRemarks;
    private String isDatelastSprayed;
    private String dateLastSprayedRemarks;
    private String isDocumentedtraceability;
    private String documentedTraceabilityRemarks;
    private String isArePackedproductsCoded;
    private String arePackedProductsCodedRemarks;
    private String isOrderandDispatch;
    private String orderAndDispatchRemarks;
    private String isChemicalListapproved;
    private String hemicallistapprovedRemarks;
    private String isTradenameoftheProductRecorded;
    private String tradenameOftheProductRecordedRemarks;
    private String isAmountofChemicalAppliedRecorded;
    private String amountOfChemicalAppliedRecordedRemarks;
    private String isTrainingschedule;
    private String trainingScheduleRemarks;
    private String isListofProduceHandling;
    private String listofProduceHandlingRemarks;
    private String isproofOfTraining;
    private String proofOfTrainingRemarks;
    private String isWorkingAreaandPremisesKept;
    private String workingAreaAndPremisesKeptRemarks;
    private String isPersonalwearing;
    private String personalWearingRemarks;
    private String isFoodhandlingPersonel;
    private String foodhandlingPersonelRemarks;
    private String isFoodhandlingequipment;
    private String foodhandlingEquipmentRemarks;
    private String isAdequateventillation;
    private String adequateVentillationRemarks;
    private String isFacilityconformshealthAct;
    private String acilityConformshealthActRemarks;
    private String isFacilitydesigned;
    private String facilityDesignedRemarks;
    private String isDisplayedprominentSigns;
    private String isplayedProminentSignsRemarks;
    private String isDisplayedProminentproduceSpecifications;
    private String displayedProminentProduceSpecificationsRemarks;
    private String isStorageareaOfPackaging;
    private String storageAreaOfPackagingRemarks;
    private String isProductsgraded;
    private String productsGradedRemarks;
    private String isProducefollowFIFO;
    private String produceFollowFIFORemarks;
    private String isAcquissitionofProduce;
    private String acquissitionOfProduceRemarks;
    private String isStorageareaSafeHygiene;
    private String storageAreaSafeHygieneRemarks;
    private String otherComments;
    private String officerrecommendation;
    private String officerrecommendation_remark;
    private boolean is_synced;
    private String remote_id;

//    public HCDParkhouseWarehouse() {
//    }


    public HCDParkhouseWarehouse(int hcdParkhouseWarehouse_id, String documentNumber, String documentDate, String dealerCategory, String nameOfApplicant, String telephone, String email, String county, String location, String produceCrops, String exportLicence, String localID, String name, String tel, String location2, String licenceNumber, String isCertificationtoSafetyStandards, String certificationToSafetyStandardsRemarks, String isDulysignedExporter, String dulySignedExporterRemarks, String isListandCodes, String listAndCodesRemarks, String isRegisterofIncomingProduce, String registerOfIncomingProduceRemarks, String isAreproduceAndSourcesDeclared, String areProduceAndSourcesDeclaredRemarks, String isCopiesofProduceCollection, String copiesOfProduceCollectionRemarks, String isHarvestdateAndQuantity, String harvestDateAndQuantityRemarks, String isDatelastSprayed, String dateLastSprayedRemarks, String isDocumentedtraceability, String documentedTraceabilityRemarks, String isArePackedproductsCoded, String arePackedProductsCodedRemarks, String isOrderandDispatch, String orderAndDispatchRemarks, String isChemicalListapproved, String hemicallistapprovedRemarks, String isTradenameoftheProductRecorded, String tradenameOftheProductRecordedRemarks, String isAmountofChemicalAppliedRecorded, String amountOfChemicalAppliedRecordedRemarks, String isTrainingschedule, String trainingScheduleRemarks, String isListofProduceHandling, String listofProduceHandlingRemarks, String isproofOfTraining, String proofOfTrainingRemarks, String isWorkingAreaandPremisesKept, String workingAreaAndPremisesKeptRemarks, String isPersonalwearing, String personalWearingRemarks, String isFoodhandlingPersonel, String foodhandlingPersonelRemarks, String isFoodhandlingequipment, String foodhandlingEquipmentRemarks, String isAdequateventillation, String adequateVentillationRemarks, String isFacilityconformshealthAct, String acilityConformshealthActRemarks, String isFacilitydesigned, String facilityDesignedRemarks, String isDisplayedprominentSigns, String isplayedProminentSignsRemarks, String isDisplayedProminentproduceSpecifications, String displayedProminentProduceSpecificationsRemarks, String isStorageareaOfPackaging, String storageAreaOfPackagingRemarks, String isProductsgraded, String productsGradedRemarks, String isProducefollowFIFO, String produceFollowFIFORemarks, String isAcquissitionofProduce, String acquissitionOfProduceRemarks, String isStorageareaSafeHygiene, String storageAreaSafeHygieneRemarks, String otherComments, String officerrecommendation, String officerrecommendation_remark, boolean is_synced, String remote_id) {
        this.hcdParkhouseWarehouse_id = hcdParkhouseWarehouse_id;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.dealerCategory = dealerCategory;
        this.nameOfApplicant = nameOfApplicant;
        this.telephone = telephone;
        this.email = email;
        this.county = county;
        this.location = location;
        this.produceCrops = produceCrops;
        this.exportLicence = exportLicence;
        this.localID = localID;
        this.name = name;
        this.tel = tel;
        this.location2 = location2;
        this.licenceNumber = licenceNumber;
        this.isCertificationtoSafetyStandards = isCertificationtoSafetyStandards;
        this.certificationToSafetyStandardsRemarks = certificationToSafetyStandardsRemarks;
        this.isDulysignedExporter = isDulysignedExporter;
        this.dulySignedExporterRemarks = dulySignedExporterRemarks;
        this.isListandCodes = isListandCodes;
        this.listAndCodesRemarks = listAndCodesRemarks;
        this.isRegisterofIncomingProduce = isRegisterofIncomingProduce;
        this.registerOfIncomingProduceRemarks = registerOfIncomingProduceRemarks;
        this.isAreproduceAndSourcesDeclared = isAreproduceAndSourcesDeclared;
        this.areProduceAndSourcesDeclaredRemarks = areProduceAndSourcesDeclaredRemarks;
        this.isCopiesofProduceCollection = isCopiesofProduceCollection;
        this.copiesOfProduceCollectionRemarks = copiesOfProduceCollectionRemarks;
        this.isHarvestdateAndQuantity = isHarvestdateAndQuantity;
        this.harvestDateAndQuantityRemarks = harvestDateAndQuantityRemarks;
        this.isDatelastSprayed = isDatelastSprayed;
        this.dateLastSprayedRemarks = dateLastSprayedRemarks;
        this.isDocumentedtraceability = isDocumentedtraceability;
        this.documentedTraceabilityRemarks = documentedTraceabilityRemarks;
        this.isArePackedproductsCoded = isArePackedproductsCoded;
        this.arePackedProductsCodedRemarks = arePackedProductsCodedRemarks;
        this.isOrderandDispatch = isOrderandDispatch;
        this.orderAndDispatchRemarks = orderAndDispatchRemarks;
        this.isChemicalListapproved = isChemicalListapproved;
        this.hemicallistapprovedRemarks = hemicallistapprovedRemarks;
        this.isTradenameoftheProductRecorded = isTradenameoftheProductRecorded;
        this.tradenameOftheProductRecordedRemarks = tradenameOftheProductRecordedRemarks;
        this.isAmountofChemicalAppliedRecorded = isAmountofChemicalAppliedRecorded;
        this.amountOfChemicalAppliedRecordedRemarks = amountOfChemicalAppliedRecordedRemarks;
        this.isTrainingschedule = isTrainingschedule;
        this.trainingScheduleRemarks = trainingScheduleRemarks;
        this.isListofProduceHandling = isListofProduceHandling;
        this.listofProduceHandlingRemarks = listofProduceHandlingRemarks;
        this.isproofOfTraining = isproofOfTraining;
        this.proofOfTrainingRemarks = proofOfTrainingRemarks;
        this.isWorkingAreaandPremisesKept = isWorkingAreaandPremisesKept;
        this.workingAreaAndPremisesKeptRemarks = workingAreaAndPremisesKeptRemarks;
        this.isPersonalwearing = isPersonalwearing;
        this.personalWearingRemarks = personalWearingRemarks;
        this.isFoodhandlingPersonel = isFoodhandlingPersonel;
        this.foodhandlingPersonelRemarks = foodhandlingPersonelRemarks;
        this.isFoodhandlingequipment = isFoodhandlingequipment;
        this.foodhandlingEquipmentRemarks = foodhandlingEquipmentRemarks;
        this.isAdequateventillation = isAdequateventillation;
        this.adequateVentillationRemarks = adequateVentillationRemarks;
        this.isFacilityconformshealthAct = isFacilityconformshealthAct;
        this.acilityConformshealthActRemarks = acilityConformshealthActRemarks;
        this.isFacilitydesigned = isFacilitydesigned;
        this.facilityDesignedRemarks = facilityDesignedRemarks;
        this.isDisplayedprominentSigns = isDisplayedprominentSigns;
        this.isplayedProminentSignsRemarks = isplayedProminentSignsRemarks;
        this.isDisplayedProminentproduceSpecifications = isDisplayedProminentproduceSpecifications;
        this.displayedProminentProduceSpecificationsRemarks = displayedProminentProduceSpecificationsRemarks;
        this.isStorageareaOfPackaging = isStorageareaOfPackaging;
        this.storageAreaOfPackagingRemarks = storageAreaOfPackagingRemarks;
        this.isProductsgraded = isProductsgraded;
        this.productsGradedRemarks = productsGradedRemarks;
        this.isProducefollowFIFO = isProducefollowFIFO;
        this.produceFollowFIFORemarks = produceFollowFIFORemarks;
        this.isAcquissitionofProduce = isAcquissitionofProduce;
        this.acquissitionOfProduceRemarks = acquissitionOfProduceRemarks;
        this.isStorageareaSafeHygiene = isStorageareaSafeHygiene;
        this.storageAreaSafeHygieneRemarks = storageAreaSafeHygieneRemarks;
        this.otherComments = otherComments;
        this.officerrecommendation = officerrecommendation;
        this.officerrecommendation_remark = officerrecommendation_remark;
        this.is_synced = is_synced;
        this.remote_id = remote_id;
    }

    public int getHcdParkhouseWarehouse_id() {
        return hcdParkhouseWarehouse_id;
    }

    public void setHcdParkhouseWarehouse_id(int hcdParkhouseWarehouse_id) {
        this.hcdParkhouseWarehouse_id = hcdParkhouseWarehouse_id;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public String getDealerCategory() {
        return dealerCategory;
    }

    public void setDealerCategory(String dealerCategory) {
        this.dealerCategory = dealerCategory;
    }

    public String getNameOfApplicant() {
        return nameOfApplicant;
    }

    public void setNameOfApplicant(String nameOfApplicant) {
        this.nameOfApplicant = nameOfApplicant;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProduceCrops() {
        return produceCrops;
    }

    public void setProduceCrops(String produceCrops) {
        this.produceCrops = produceCrops;
    }

    public String getExportLicence() {
        return exportLicence;
    }

    public void setExportLicence(String exportLicence) {
        this.exportLicence = exportLicence;
    }

    public String getLocalID() {
        return localID;
    }

    public void setLocalID(String localID) {
        this.localID = localID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getIsCertificationtoSafetyStandards() {
        return isCertificationtoSafetyStandards;
    }

    public void setIsCertificationtoSafetyStandards(String isCertificationtoSafetyStandards) {
        this.isCertificationtoSafetyStandards = isCertificationtoSafetyStandards;
    }

    public String getCertificationToSafetyStandardsRemarks() {
        return certificationToSafetyStandardsRemarks;
    }

    public void setCertificationToSafetyStandardsRemarks(String certificationToSafetyStandardsRemarks) {
        this.certificationToSafetyStandardsRemarks = certificationToSafetyStandardsRemarks;
    }

    public String getIsDulysignedExporter() {
        return isDulysignedExporter;
    }

    public void setIsDulysignedExporter(String isDulysignedExporter) {
        this.isDulysignedExporter = isDulysignedExporter;
    }

    public String getDulySignedExporterRemarks() {
        return dulySignedExporterRemarks;
    }

    public void setDulySignedExporterRemarks(String dulySignedExporterRemarks) {
        this.dulySignedExporterRemarks = dulySignedExporterRemarks;
    }

    public String getIsListandCodes() {
        return isListandCodes;
    }

    public void setIsListandCodes(String isListandCodes) {
        this.isListandCodes = isListandCodes;
    }

    public String getListAndCodesRemarks() {
        return listAndCodesRemarks;
    }

    public void setListAndCodesRemarks(String listAndCodesRemarks) {
        this.listAndCodesRemarks = listAndCodesRemarks;
    }

    public String getIsRegisterofIncomingProduce() {
        return isRegisterofIncomingProduce;
    }

    public void setIsRegisterofIncomingProduce(String isRegisterofIncomingProduce) {
        this.isRegisterofIncomingProduce = isRegisterofIncomingProduce;
    }

    public String getRegisterOfIncomingProduceRemarks() {
        return registerOfIncomingProduceRemarks;
    }

    public void setRegisterOfIncomingProduceRemarks(String registerOfIncomingProduceRemarks) {
        this.registerOfIncomingProduceRemarks = registerOfIncomingProduceRemarks;
    }

    public String getIsAreproduceAndSourcesDeclared() {
        return isAreproduceAndSourcesDeclared;
    }

    public void setIsAreproduceAndSourcesDeclared(String isAreproduceAndSourcesDeclared) {
        this.isAreproduceAndSourcesDeclared = isAreproduceAndSourcesDeclared;
    }

    public String getAreProduceAndSourcesDeclaredRemarks() {
        return areProduceAndSourcesDeclaredRemarks;
    }

    public void setAreProduceAndSourcesDeclaredRemarks(String areProduceAndSourcesDeclaredRemarks) {
        this.areProduceAndSourcesDeclaredRemarks = areProduceAndSourcesDeclaredRemarks;
    }

    public String getIsCopiesofProduceCollection() {
        return isCopiesofProduceCollection;
    }

    public void setIsCopiesofProduceCollection(String isCopiesofProduceCollection) {
        this.isCopiesofProduceCollection = isCopiesofProduceCollection;
    }

    public String getCopiesOfProduceCollectionRemarks() {
        return copiesOfProduceCollectionRemarks;
    }

    public void setCopiesOfProduceCollectionRemarks(String copiesOfProduceCollectionRemarks) {
        this.copiesOfProduceCollectionRemarks = copiesOfProduceCollectionRemarks;
    }

    public String getIsHarvestdateAndQuantity() {
        return isHarvestdateAndQuantity;
    }

    public void setIsHarvestdateAndQuantity(String isHarvestdateAndQuantity) {
        this.isHarvestdateAndQuantity = isHarvestdateAndQuantity;
    }

    public String getHarvestDateAndQuantityRemarks() {
        return harvestDateAndQuantityRemarks;
    }

    public void setHarvestDateAndQuantityRemarks(String harvestDateAndQuantityRemarks) {
        this.harvestDateAndQuantityRemarks = harvestDateAndQuantityRemarks;
    }

    public String getIsDatelastSprayed() {
        return isDatelastSprayed;
    }

    public void setIsDatelastSprayed(String isDatelastSprayed) {
        this.isDatelastSprayed = isDatelastSprayed;
    }

    public String getDateLastSprayedRemarks() {
        return dateLastSprayedRemarks;
    }

    public void setDateLastSprayedRemarks(String dateLastSprayedRemarks) {
        this.dateLastSprayedRemarks = dateLastSprayedRemarks;
    }

    public String getIsDocumentedtraceability() {
        return isDocumentedtraceability;
    }

    public void setIsDocumentedtraceability(String isDocumentedtraceability) {
        this.isDocumentedtraceability = isDocumentedtraceability;
    }

    public String getDocumentedTraceabilityRemarks() {
        return documentedTraceabilityRemarks;
    }

    public void setDocumentedTraceabilityRemarks(String documentedTraceabilityRemarks) {
        this.documentedTraceabilityRemarks = documentedTraceabilityRemarks;
    }

    public String getIsArePackedproductsCoded() {
        return isArePackedproductsCoded;
    }

    public void setIsArePackedproductsCoded(String isArePackedproductsCoded) {
        this.isArePackedproductsCoded = isArePackedproductsCoded;
    }

    public String getArePackedProductsCodedRemarks() {
        return arePackedProductsCodedRemarks;
    }

    public void setArePackedProductsCodedRemarks(String arePackedProductsCodedRemarks) {
        this.arePackedProductsCodedRemarks = arePackedProductsCodedRemarks;
    }

    public String getIsOrderandDispatch() {
        return isOrderandDispatch;
    }

    public void setIsOrderandDispatch(String isOrderandDispatch) {
        this.isOrderandDispatch = isOrderandDispatch;
    }

    public String getOrderAndDispatchRemarks() {
        return orderAndDispatchRemarks;
    }

    public void setOrderAndDispatchRemarks(String orderAndDispatchRemarks) {
        this.orderAndDispatchRemarks = orderAndDispatchRemarks;
    }

    public String getIsChemicalListapproved() {
        return isChemicalListapproved;
    }

    public void setIsChemicalListapproved(String isChemicalListapproved) {
        this.isChemicalListapproved = isChemicalListapproved;
    }

    public String getHemicallistapprovedRemarks() {
        return hemicallistapprovedRemarks;
    }

    public void setHemicallistapprovedRemarks(String hemicallistapprovedRemarks) {
        this.hemicallistapprovedRemarks = hemicallistapprovedRemarks;
    }

    public String getIsTradenameoftheProductRecorded() {
        return isTradenameoftheProductRecorded;
    }

    public void setIsTradenameoftheProductRecorded(String isTradenameoftheProductRecorded) {
        this.isTradenameoftheProductRecorded = isTradenameoftheProductRecorded;
    }

    public String getTradenameOftheProductRecordedRemarks() {
        return tradenameOftheProductRecordedRemarks;
    }

    public void setTradenameOftheProductRecordedRemarks(String tradenameOftheProductRecordedRemarks) {
        this.tradenameOftheProductRecordedRemarks = tradenameOftheProductRecordedRemarks;
    }

    public String getIsAmountofChemicalAppliedRecorded() {
        return isAmountofChemicalAppliedRecorded;
    }

    public void setIsAmountofChemicalAppliedRecorded(String isAmountofChemicalAppliedRecorded) {
        this.isAmountofChemicalAppliedRecorded = isAmountofChemicalAppliedRecorded;
    }

    public String getAmountOfChemicalAppliedRecordedRemarks() {
        return amountOfChemicalAppliedRecordedRemarks;
    }

    public void setAmountOfChemicalAppliedRecordedRemarks(String amountOfChemicalAppliedRecordedRemarks) {
        this.amountOfChemicalAppliedRecordedRemarks = amountOfChemicalAppliedRecordedRemarks;
    }

    public String getIsTrainingschedule() {
        return isTrainingschedule;
    }

    public void setIsTrainingschedule(String isTrainingschedule) {
        this.isTrainingschedule = isTrainingschedule;
    }

    public String getTrainingScheduleRemarks() {
        return trainingScheduleRemarks;
    }

    public void setTrainingScheduleRemarks(String trainingScheduleRemarks) {
        this.trainingScheduleRemarks = trainingScheduleRemarks;
    }

    public String getIsListofProduceHandling() {
        return isListofProduceHandling;
    }

    public void setIsListofProduceHandling(String isListofProduceHandling) {
        this.isListofProduceHandling = isListofProduceHandling;
    }

    public String getListofProduceHandlingRemarks() {
        return listofProduceHandlingRemarks;
    }

    public void setListofProduceHandlingRemarks(String listofProduceHandlingRemarks) {
        this.listofProduceHandlingRemarks = listofProduceHandlingRemarks;
    }

    public String getIsproofOfTraining() {
        return isproofOfTraining;
    }

    public void setIsproofOfTraining(String isproofOfTraining) {
        this.isproofOfTraining = isproofOfTraining;
    }

    public String getProofOfTrainingRemarks() {
        return proofOfTrainingRemarks;
    }

    public void setProofOfTrainingRemarks(String proofOfTrainingRemarks) {
        this.proofOfTrainingRemarks = proofOfTrainingRemarks;
    }

    public String getIsWorkingAreaandPremisesKept() {
        return isWorkingAreaandPremisesKept;
    }

    public void setIsWorkingAreaandPremisesKept(String isWorkingAreaandPremisesKept) {
        this.isWorkingAreaandPremisesKept = isWorkingAreaandPremisesKept;
    }

    public String getWorkingAreaAndPremisesKeptRemarks() {
        return workingAreaAndPremisesKeptRemarks;
    }

    public void setWorkingAreaAndPremisesKeptRemarks(String workingAreaAndPremisesKeptRemarks) {
        this.workingAreaAndPremisesKeptRemarks = workingAreaAndPremisesKeptRemarks;
    }

    public String getIsPersonalwearing() {
        return isPersonalwearing;
    }

    public void setIsPersonalwearing(String isPersonalwearing) {
        this.isPersonalwearing = isPersonalwearing;
    }

    public String getPersonalWearingRemarks() {
        return personalWearingRemarks;
    }

    public void setPersonalWearingRemarks(String personalWearingRemarks) {
        this.personalWearingRemarks = personalWearingRemarks;
    }

    public String getIsFoodhandlingPersonel() {
        return isFoodhandlingPersonel;
    }

    public void setIsFoodhandlingPersonel(String isFoodhandlingPersonel) {
        this.isFoodhandlingPersonel = isFoodhandlingPersonel;
    }

    public String getFoodhandlingPersonelRemarks() {
        return foodhandlingPersonelRemarks;
    }

    public void setFoodhandlingPersonelRemarks(String foodhandlingPersonelRemarks) {
        this.foodhandlingPersonelRemarks = foodhandlingPersonelRemarks;
    }

    public String getIsFoodhandlingequipment() {
        return isFoodhandlingequipment;
    }

    public void setIsFoodhandlingequipment(String isFoodhandlingequipment) {
        this.isFoodhandlingequipment = isFoodhandlingequipment;
    }

    public String getFoodhandlingEquipmentRemarks() {
        return foodhandlingEquipmentRemarks;
    }

    public void setFoodhandlingEquipmentRemarks(String foodhandlingEquipmentRemarks) {
        this.foodhandlingEquipmentRemarks = foodhandlingEquipmentRemarks;
    }

    public String getIsAdequateventillation() {
        return isAdequateventillation;
    }

    public void setIsAdequateventillation(String isAdequateventillation) {
        this.isAdequateventillation = isAdequateventillation;
    }

    public String getAdequateVentillationRemarks() {
        return adequateVentillationRemarks;
    }

    public void setAdequateVentillationRemarks(String adequateVentillationRemarks) {
        this.adequateVentillationRemarks = adequateVentillationRemarks;
    }

    public String getIsFacilityconformshealthAct() {
        return isFacilityconformshealthAct;
    }

    public void setIsFacilityconformshealthAct(String isFacilityconformshealthAct) {
        this.isFacilityconformshealthAct = isFacilityconformshealthAct;
    }

    public String getAcilityConformshealthActRemarks() {
        return acilityConformshealthActRemarks;
    }

    public void setAcilityConformshealthActRemarks(String acilityConformshealthActRemarks) {
        this.acilityConformshealthActRemarks = acilityConformshealthActRemarks;
    }

    public String getIsFacilitydesigned() {
        return isFacilitydesigned;
    }

    public void setIsFacilitydesigned(String isFacilitydesigned) {
        this.isFacilitydesigned = isFacilitydesigned;
    }

    public String getFacilityDesignedRemarks() {
        return facilityDesignedRemarks;
    }

    public void setFacilityDesignedRemarks(String facilityDesignedRemarks) {
        this.facilityDesignedRemarks = facilityDesignedRemarks;
    }

    public String getIsDisplayedprominentSigns() {
        return isDisplayedprominentSigns;
    }

    public void setIsDisplayedprominentSigns(String isDisplayedprominentSigns) {
        this.isDisplayedprominentSigns = isDisplayedprominentSigns;
    }

    public String getIsplayedProminentSignsRemarks() {
        return isplayedProminentSignsRemarks;
    }

    public void setIsplayedProminentSignsRemarks(String isplayedProminentSignsRemarks) {
        this.isplayedProminentSignsRemarks = isplayedProminentSignsRemarks;
    }

    public String getIsDisplayedProminentproduceSpecifications() {
        return isDisplayedProminentproduceSpecifications;
    }

    public void setIsDisplayedProminentproduceSpecifications(String isDisplayedProminentproduceSpecifications) {
        this.isDisplayedProminentproduceSpecifications = isDisplayedProminentproduceSpecifications;
    }

    public String getDisplayedProminentProduceSpecificationsRemarks() {
        return displayedProminentProduceSpecificationsRemarks;
    }

    public void setDisplayedProminentProduceSpecificationsRemarks(String displayedProminentProduceSpecificationsRemarks) {
        this.displayedProminentProduceSpecificationsRemarks = displayedProminentProduceSpecificationsRemarks;
    }

    public String getIsStorageareaOfPackaging() {
        return isStorageareaOfPackaging;
    }

    public void setIsStorageareaOfPackaging(String isStorageareaOfPackaging) {
        this.isStorageareaOfPackaging = isStorageareaOfPackaging;
    }

    public String getStorageAreaOfPackagingRemarks() {
        return storageAreaOfPackagingRemarks;
    }

    public void setStorageAreaOfPackagingRemarks(String storageAreaOfPackagingRemarks) {
        this.storageAreaOfPackagingRemarks = storageAreaOfPackagingRemarks;
    }

    public String getIsProductsgraded() {
        return isProductsgraded;
    }

    public void setIsProductsgraded(String isProductsgraded) {
        this.isProductsgraded = isProductsgraded;
    }

    public String getProductsGradedRemarks() {
        return productsGradedRemarks;
    }

    public void setProductsGradedRemarks(String productsGradedRemarks) {
        this.productsGradedRemarks = productsGradedRemarks;
    }

    public String getIsProducefollowFIFO() {
        return isProducefollowFIFO;
    }

    public void setIsProducefollowFIFO(String isProducefollowFIFO) {
        this.isProducefollowFIFO = isProducefollowFIFO;
    }

    public String getProduceFollowFIFORemarks() {
        return produceFollowFIFORemarks;
    }

    public void setProduceFollowFIFORemarks(String produceFollowFIFORemarks) {
        this.produceFollowFIFORemarks = produceFollowFIFORemarks;
    }

    public String getIsAcquissitionofProduce() {
        return isAcquissitionofProduce;
    }

    public void setIsAcquissitionofProduce(String isAcquissitionofProduce) {
        this.isAcquissitionofProduce = isAcquissitionofProduce;
    }

    public String getAcquissitionOfProduceRemarks() {
        return acquissitionOfProduceRemarks;
    }

    public void setAcquissitionOfProduceRemarks(String acquissitionOfProduceRemarks) {
        this.acquissitionOfProduceRemarks = acquissitionOfProduceRemarks;
    }

    public String getIsStorageareaSafeHygiene() {
        return isStorageareaSafeHygiene;
    }

    public void setIsStorageareaSafeHygiene(String isStorageareaSafeHygiene) {
        this.isStorageareaSafeHygiene = isStorageareaSafeHygiene;
    }

    public String getStorageAreaSafeHygieneRemarks() {
        return storageAreaSafeHygieneRemarks;
    }

    public void setStorageAreaSafeHygieneRemarks(String storageAreaSafeHygieneRemarks) {
        this.storageAreaSafeHygieneRemarks = storageAreaSafeHygieneRemarks;
    }

    public String getOtherComments() {
        return otherComments;
    }

    public void setOtherComments(String otherComments) {
        this.otherComments = otherComments;
    }

    public boolean isIs_synced() {
        return is_synced;
    }

    public void setIs_synced(boolean is_synced) {
        this.is_synced = is_synced;
    }

    public String getRemote_id() {
        return remote_id;
    }

    public void setRemote_id(String remote_id) {
        this.remote_id = remote_id;
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
