package br.com.PortalRh.Projeto.service;

import br.com.PortalRh.Projeto.entities.*;
import br.com.PortalRh.Projeto.entities.enuns.*;
import br.com.PortalRh.Projeto.repository.AddressRepository;
import br.com.PortalRh.Projeto.repository.AdmissionRepository;
import br.com.PortalRh.Projeto.repository.CertificationRepository;
import br.com.PortalRh.Projeto.repository.PrevExpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdmissionService {

    //Corrigir os repositories
//    private final AdmissionRepository admissionRepository;
//    private final BankDataRepository bankDataRepository;
//    private final AddressRepository addressRepository;
//    private final AsoRepository asoRepository;
//    private final CertificationRepository certificationRepository;
//    private final ChildrenRepository childrenRepository;
//    private final CooperatorRepository cooperatorRepository;
//    private final DemissionRepository demissionRepository;
//    private final ParentRepository parentRepository;
//    private final PersonRepository personRepository;
//    private final PositionRepository positionRepository;
//    private final PrevExpRepository prevExpRepository;
//    private final SocialMediaRepository socialMediaRepository;

//    @Autowired
//    public AdmissionService(AdmissionRepository admissionRepository,
//                            BankDataRepository bankDataRepository,
//                            AddressRepository addressRepository,
//                            AsoRepository asoRepository,
//                            CertificationRepository certificationRepository,
//                            ChildrenRepository childrenRepository,
//                            CooperatorRepository cooperatorRepository,
//                            DemissionRepository demissionRepository,
//                            ParentRepository parentRepository,
//                            PersonRepository personRepository,
//                            PositionRepository positionRepository,
//                            PrevExpRepository prevExpRepository,
//                            SocialMediaRepository socialMediaRepository) {
//        this.admissionRepository = admissionRepository;
//        this.bankDataRepository = bankDataRepository;
//        this.addressRepository = addressRepository;
//        this.asoRepository = asoRepository;
//        this.certificationRepository = certificationRepository;
//        this.childrenRepository = childrenRepository;
//        this.cooperatorRepository = cooperatorRepository;
//        this.demissionRepository = demissionRepository;
//        this.parentRepository = parentRepository;
//        this.personRepository = personRepository;
//        this.positionRepository = positionRepository;
//        this.prevExpRepository = prevExpRepository;
//        this.socialMediaRepository = socialMediaRepository;
//    }
//
//    public Admission admitEmployee(Admission entity, AccType accType, BloodType bloodType,
//                                   ContractModality contractModality, Education education,
//                                   MaritalStatus maritalStatus, Shift shift, State state,
//                                   Address address, Aso aso, BankData bankData,
//                                   Certification certification, Children children,
//                                   Cooperator cooperator, Parent parent, Position position,
//                                   PrevExp prevExp, SocialMedia socialMedia) {
//
//        // Salvando dados relacionados à admissão
//        entity.setAccType(accType);
//        entity.setBloodType(bloodType);
//        entity.setContractModality(contractModality);
//        entity.setEducation(education);
//        entity.setMaritalStatus(maritalStatus);
//        entity.setShift(shift);
//        entity.setState(state);
//
//        // Salvando entidades relacionadas
//        Address savedAddress = addressRepository.save(address);
//        entity.setAddress(savedAddress);
//
//        Aso savedAso = asoRepository.save(aso);
//        entity.setAso(savedAso);
//
//        BankData savedBankData = bankDataRepository.save(bankData);
//        entity.setBankData(savedBankData);
//
//        Certification savedCertification = certificationRepository.save(certification);
//        entity.setCertification(savedCertification);
//
//        Children savedChildren = childrenRepository.save(children);
//        entity.setChildren(savedChildren);
//
//        Cooperator savedCooperator = cooperatorRepository.save(cooperator);
//        entity.setCooperator(savedCooperator);
//
//        Parent savedParent = parentRepository.save(parent);
//        entity.setParent(savedParent);
//
//        Position savedPosition = positionRepository.save(position);
//        entity.setPosition(savedPosition);
//
//        PrevExp savedPrevExp = prevExpRepository.save(prevExp);
//        entity.setPrevExp(savedPrevExp);
//
//        SocialMedia savedSocialMedia = socialMediaRepository.save(socialMedia);
//        entity.setSocialMedia(savedSocialMedia);
//
//        // Salvando admissão completa
//        return admissionRepository.save(entity);
    }

