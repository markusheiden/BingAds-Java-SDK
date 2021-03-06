package com.microsoft.bingads.examples.v13;

import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import com.microsoft.bingads.*;
import com.microsoft.bingads.v13.customermanagement.*;

class CustomerManagementExampleHelper
{
    static ServiceClient<ICustomerManagementService> CustomerManagementService;
    static AddAccountResponse addAccount(
        AdvertiserAccount account) throws RemoteException, Exception
    {
        AddAccountRequest request = new AddAccountRequest();

        request.setAccount(account);

        return CustomerManagementService.getService().addAccount(request);
    }
    static AddClientLinksResponse addClientLinks(
        ArrayOfClientLink clientLinks) throws RemoteException, Exception
    {
        AddClientLinksRequest request = new AddClientLinksRequest();

        request.setClientLinks(clientLinks);

        return CustomerManagementService.getService().addClientLinks(request);
    }
    static DeleteAccountResponse deleteAccount(
        java.lang.Long accountId,
        byte[] timeStamp) throws RemoteException, Exception
    {
        DeleteAccountRequest request = new DeleteAccountRequest();

        request.setAccountId(accountId);
        request.setTimeStamp(timeStamp);

        return CustomerManagementService.getService().deleteAccount(request);
    }
    static DeleteCustomerResponse deleteCustomer(
        java.lang.Long customerId,
        byte[] timeStamp) throws RemoteException, Exception
    {
        DeleteCustomerRequest request = new DeleteCustomerRequest();

        request.setCustomerId(customerId);
        request.setTimeStamp(timeStamp);

        return CustomerManagementService.getService().deleteCustomer(request);
    }
    static DeleteUserResponse deleteUser(
        java.lang.Long userId,
        byte[] timeStamp) throws RemoteException, Exception
    {
        DeleteUserRequest request = new DeleteUserRequest();

        request.setUserId(userId);
        request.setTimeStamp(timeStamp);

        return CustomerManagementService.getService().deleteUser(request);
    }
    static FindAccountsResponse findAccounts(
        java.lang.Long customerId,
        java.lang.String accountFilter,
        java.lang.Integer topN) throws RemoteException, Exception
    {
        FindAccountsRequest request = new FindAccountsRequest();

        request.setCustomerId(customerId);
        request.setAccountFilter(accountFilter);
        request.setTopN(topN);

        return CustomerManagementService.getService().findAccounts(request);
    }
    static FindAccountsOrCustomersInfoResponse findAccountsOrCustomersInfo(
        java.lang.String filter,
        java.lang.Integer topN) throws RemoteException, Exception
    {
        FindAccountsOrCustomersInfoRequest request = new FindAccountsOrCustomersInfoRequest();

        request.setFilter(filter);
        request.setTopN(topN);

        return CustomerManagementService.getService().findAccountsOrCustomersInfo(request);
    }
    static GetAccountResponse getAccount(
        java.lang.Long accountId) throws RemoteException, Exception
    {
        GetAccountRequest request = new GetAccountRequest();

        request.setAccountId(accountId);

        return CustomerManagementService.getService().getAccount(request);
    }
    static GetAccountPilotFeaturesResponse getAccountPilotFeatures(
        java.lang.Long accountId) throws RemoteException, Exception
    {
        GetAccountPilotFeaturesRequest request = new GetAccountPilotFeaturesRequest();

        request.setAccountId(accountId);

        return CustomerManagementService.getService().getAccountPilotFeatures(request);
    }
    static GetAccountsInfoResponse getAccountsInfo(
        java.lang.Long customerId,
        java.lang.Boolean onlyParentAccounts) throws RemoteException, Exception
    {
        GetAccountsInfoRequest request = new GetAccountsInfoRequest();

        request.setCustomerId(customerId);
        request.setOnlyParentAccounts(onlyParentAccounts);

        return CustomerManagementService.getService().getAccountsInfo(request);
    }
    static GetCustomerResponse getCustomer(
        java.lang.Long customerId) throws RemoteException, Exception
    {
        GetCustomerRequest request = new GetCustomerRequest();

        request.setCustomerId(customerId);

        return CustomerManagementService.getService().getCustomer(request);
    }
    static GetCustomerPilotFeaturesResponse getCustomerPilotFeatures(
        java.lang.Long customerId) throws RemoteException, Exception
    {
        GetCustomerPilotFeaturesRequest request = new GetCustomerPilotFeaturesRequest();

        request.setCustomerId(customerId);

        return CustomerManagementService.getService().getCustomerPilotFeatures(request);
    }
    static GetCustomersInfoResponse getCustomersInfo(
        java.lang.String customerNameFilter,
        java.lang.Integer topN) throws RemoteException, Exception
    {
        GetCustomersInfoRequest request = new GetCustomersInfoRequest();

        request.setCustomerNameFilter(customerNameFilter);
        request.setTopN(topN);

        return CustomerManagementService.getService().getCustomersInfo(request);
    }
    static GetLinkedAccountsAndCustomersInfoResponse getLinkedAccountsAndCustomersInfo(
        java.lang.Long customerId,
        java.lang.Boolean onlyParentAccounts) throws RemoteException, Exception
    {
        GetLinkedAccountsAndCustomersInfoRequest request = new GetLinkedAccountsAndCustomersInfoRequest();

        request.setCustomerId(customerId);
        request.setOnlyParentAccounts(onlyParentAccounts);

        return CustomerManagementService.getService().getLinkedAccountsAndCustomersInfo(request);
    }
    static GetUserResponse getUser(
        java.lang.Long userId) throws RemoteException, Exception
    {
        GetUserRequest request = new GetUserRequest();

        request.setUserId(userId);

        return CustomerManagementService.getService().getUser(request);
    }
    static GetUsersInfoResponse getUsersInfo(
        java.lang.Long customerId,
        UserLifeCycleStatus statusFilter) throws RemoteException, Exception
    {
        GetUsersInfoRequest request = new GetUsersInfoRequest();

        request.setCustomerId(customerId);
        request.setStatusFilter(statusFilter);

        return CustomerManagementService.getService().getUsersInfo(request);
    }
    static SearchAccountsResponse searchAccounts(
        ArrayOfPredicate predicates,
        ArrayOfOrderBy ordering,
        Paging pageInfo) throws RemoteException, Exception
    {
        SearchAccountsRequest request = new SearchAccountsRequest();

        request.setPredicates(predicates);
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);

        return CustomerManagementService.getService().searchAccounts(request);
    }
    static SearchClientLinksResponse searchClientLinks(
        ArrayOfPredicate predicates,
        ArrayOfOrderBy ordering,
        Paging pageInfo) throws RemoteException, Exception
    {
        SearchClientLinksRequest request = new SearchClientLinksRequest();

        request.setPredicates(predicates);
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);

        return CustomerManagementService.getService().searchClientLinks(request);
    }
    static SearchCustomersResponse searchCustomers(
        ArrayOfPredicate predicates,
        DateRange dateRange,
        ArrayOfOrderBy ordering,
        Paging pageInfo) throws RemoteException, Exception
    {
        SearchCustomersRequest request = new SearchCustomersRequest();

        request.setPredicates(predicates);
        request.setDateRange(dateRange);
        request.setOrdering(ordering);
        request.setPageInfo(pageInfo);

        return CustomerManagementService.getService().searchCustomers(request);
    }
    static SearchUserInvitationsResponse searchUserInvitations(
        ArrayOfPredicate predicates) throws RemoteException, Exception
    {
        SearchUserInvitationsRequest request = new SearchUserInvitationsRequest();

        request.setPredicates(predicates);

        return CustomerManagementService.getService().searchUserInvitations(request);
    }
    static SendUserInvitationResponse sendUserInvitation(
        UserInvitation userInvitation) throws RemoteException, Exception
    {
        SendUserInvitationRequest request = new SendUserInvitationRequest();

        request.setUserInvitation(userInvitation);

        return CustomerManagementService.getService().sendUserInvitation(request);
    }
    static SignupCustomerResponse signupCustomer(
        Customer customer,
        AdvertiserAccount account,
        java.lang.Long parentCustomerId) throws RemoteException, Exception
    {
        SignupCustomerRequest request = new SignupCustomerRequest();

        request.setCustomer(customer);
        request.setAccount(account);
        request.setParentCustomerId(parentCustomerId);

        return CustomerManagementService.getService().signupCustomer(request);
    }
    static UpdateAccountResponse updateAccount(
        AdvertiserAccount account) throws RemoteException, Exception
    {
        UpdateAccountRequest request = new UpdateAccountRequest();

        request.setAccount(account);

        return CustomerManagementService.getService().updateAccount(request);
    }
    static UpdateClientLinksResponse updateClientLinks(
        ArrayOfClientLink clientLinks) throws RemoteException, Exception
    {
        UpdateClientLinksRequest request = new UpdateClientLinksRequest();

        request.setClientLinks(clientLinks);

        return CustomerManagementService.getService().updateClientLinks(request);
    }
    static UpdateCustomerResponse updateCustomer(
        Customer customer) throws RemoteException, Exception
    {
        UpdateCustomerRequest request = new UpdateCustomerRequest();

        request.setCustomer(customer);

        return CustomerManagementService.getService().updateCustomer(request);
    }
    static UpdateUserResponse updateUser(
        User user) throws RemoteException, Exception
    {
        UpdateUserRequest request = new UpdateUserRequest();

        request.setUser(user);

        return CustomerManagementService.getService().updateUser(request);
    }
    static UpdateUserRolesResponse updateUserRoles(
        java.lang.Long customerId,
        java.lang.Long userId,
        java.lang.Integer newRoleId,
        ArrayOflong newAccountIds,
        ArrayOflong newCustomerIds,
        java.lang.Integer deleteRoleId,
        ArrayOflong deleteAccountIds,
        ArrayOflong deleteCustomerIds) throws RemoteException, Exception
    {
        UpdateUserRolesRequest request = new UpdateUserRolesRequest();

        request.setCustomerId(customerId);
        request.setUserId(userId);
        request.setNewRoleId(newRoleId);
        request.setNewAccountIds(newAccountIds);
        request.setNewCustomerIds(newCustomerIds);
        request.setDeleteRoleId(deleteRoleId);
        request.setDeleteAccountIds(deleteAccountIds);
        request.setDeleteCustomerIds(deleteCustomerIds);

        return CustomerManagementService.getService().updateUserRoles(request);
    }
    static ValidateAddressResponse validateAddress(
        Address address) throws RemoteException, Exception
    {
        ValidateAddressRequest request = new ValidateAddressRequest();

        request.setAddress(address);

        return CustomerManagementService.getService().validateAddress(request);
    }
    static void outputAccountInfo(AccountInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountInfo * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Number: %s", dataObject.getNumber()));
            outputStatusMessage(String.format("AccountLifeCycleStatus: %s", dataObject.getAccountLifeCycleStatus()));
            outputStatusMessage(String.format("PauseReason: %s", dataObject.getPauseReason()));
            outputStatusMessage("* * * End OutputAccountInfo * * *");
        }
    }
    static void outputArrayOfAccountInfo(ArrayOfAccountInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountInfo dataObject : dataObjects.getAccountInfos())
            {
                outputAccountInfo(dataObject);
            }
        }
    }
    static void outputAccountInfoWithCustomerData(AccountInfoWithCustomerData dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAccountInfoWithCustomerData * * *");
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage(String.format("CustomerName: %s", dataObject.getCustomerName()));
            outputStatusMessage(String.format("AccountId: %s", dataObject.getAccountId()));
            outputStatusMessage(String.format("AccountName: %s", dataObject.getAccountName()));
            outputStatusMessage(String.format("AccountNumber: %s", dataObject.getAccountNumber()));
            outputStatusMessage(String.format("AccountLifeCycleStatus: %s", dataObject.getAccountLifeCycleStatus()));
            outputStatusMessage(String.format("PauseReason: %s", dataObject.getPauseReason()));
            outputStatusMessage("* * * End OutputAccountInfoWithCustomerData * * *");
        }
    }
    static void outputArrayOfAccountInfoWithCustomerData(ArrayOfAccountInfoWithCustomerData dataObjects)
    {
        if (null != dataObjects)
        {
            for (AccountInfoWithCustomerData dataObject : dataObjects.getAccountInfoWithCustomerDatas())
            {
                outputAccountInfoWithCustomerData(dataObject);
            }
        }
    }
    static void outputAdApiError(AdApiError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdApiError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Detail: %s", dataObject.getDetail()));
            outputStatusMessage(String.format("ErrorCode: %s", dataObject.getErrorCode()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputAdApiError * * *");
        }
    }
    static void outputArrayOfAdApiError(ArrayOfAdApiError dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiError dataObject : dataObjects.getAdApiErrors())
            {
                outputAdApiError(dataObject);
            }
        }
    }
    static void outputAdApiFaultDetail(AdApiFaultDetail dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdApiFaultDetail * * *");
            outputStatusMessage("Errors:");
            outputArrayOfAdApiError(dataObject.getErrors());
            outputStatusMessage("* * * End OutputAdApiFaultDetail * * *");
        }
    }
    static void outputArrayOfAdApiFaultDetail(ArrayList<AdApiFaultDetail> dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdApiFaultDetail dataObject : dataObjects)
            {
                outputAdApiFaultDetail(dataObject);
            }
        }
    }
    static void outputAddress(Address dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAddress * * *");
            outputStatusMessage(String.format("City: %s", dataObject.getCity()));
            outputStatusMessage(String.format("CountryCode: %s", dataObject.getCountryCode()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Line1: %s", dataObject.getLine1()));
            outputStatusMessage(String.format("Line2: %s", dataObject.getLine2()));
            outputStatusMessage(String.format("Line3: %s", dataObject.getLine3()));
            outputStatusMessage(String.format("Line4: %s", dataObject.getLine4()));
            outputStatusMessage(String.format("PostalCode: %s", dataObject.getPostalCode()));
            outputStatusMessage(String.format("StateOrProvince: %s", dataObject.getStateOrProvince()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
            outputStatusMessage(String.format("BusinessName: %s", dataObject.getBusinessName()));
            outputStatusMessage("* * * End OutputAddress * * *");
        }
    }
    static void outputArrayOfAddress(ArrayOfAddress dataObjects)
    {
        if (null != dataObjects)
        {
            for (Address dataObject : dataObjects.getAddresses())
            {
                outputAddress(dataObject);
            }
        }
    }
    static void outputAdvertiserAccount(AdvertiserAccount dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputAdvertiserAccount * * *");
            outputStatusMessage(String.format("BillToCustomerId: %s", dataObject.getBillToCustomerId()));
            outputStatusMessage(String.format("CurrencyCode: %s", dataObject.getCurrencyCode()));
            outputStatusMessage(String.format("AccountFinancialStatus: %s", dataObject.getAccountFinancialStatus()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Language: %s", dataObject.getLanguage()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("Number: %s", dataObject.getNumber()));
            outputStatusMessage(String.format("ParentCustomerId: %s", dataObject.getParentCustomerId()));
            outputStatusMessage(String.format("PaymentMethodId: %s", dataObject.getPaymentMethodId()));
            outputStatusMessage(String.format("PaymentMethodType: %s", dataObject.getPaymentMethodType()));
            outputStatusMessage(String.format("PrimaryUserId: %s", dataObject.getPrimaryUserId()));
            outputStatusMessage(String.format("AccountLifeCycleStatus: %s", dataObject.getAccountLifeCycleStatus()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
            outputStatusMessage(String.format("TimeZone: %s", dataObject.getTimeZone()));
            outputStatusMessage(String.format("PauseReason: %s", dataObject.getPauseReason()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage("LinkedAgencies:");
            outputArrayOfCustomerInfo(dataObject.getLinkedAgencies());
            outputStatusMessage(String.format("SalesHouseCustomerId: %s", dataObject.getSalesHouseCustomerId()));
            outputStatusMessage("TaxInformation:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getTaxInformation());
            outputStatusMessage(String.format("BackUpPaymentInstrumentId: %s", dataObject.getBackUpPaymentInstrumentId()));
            outputStatusMessage(String.format("BillingThresholdAmount: %s", dataObject.getBillingThresholdAmount()));
            outputStatusMessage("BusinessAddress:");
            outputAddress(dataObject.getBusinessAddress());
            outputStatusMessage(String.format("AutoTagType: %s", dataObject.getAutoTagType()));
            outputStatusMessage(String.format("SoldToPaymentInstrumentId: %s", dataObject.getSoldToPaymentInstrumentId()));
            outputStatusMessage("* * * End OutputAdvertiserAccount * * *");
        }
    }
    static void outputArrayOfAdvertiserAccount(ArrayOfAdvertiserAccount dataObjects)
    {
        if (null != dataObjects)
        {
            for (AdvertiserAccount dataObject : dataObjects.getAdvertiserAccounts())
            {
                outputAdvertiserAccount(dataObject);
            }
        }
    }
    static void outputApiFault(ApiFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApiFault * * *");
            outputStatusMessage("OperationErrors:");
            outputArrayOfOperationError(dataObject.getOperationErrors());
            outputStatusMessage("* * * End OutputApiFault * * *");
        }
    }
    static void outputArrayOfApiFault(ArrayList<ApiFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApiFault dataObject : dataObjects)
            {
                outputApiFault(dataObject);
            }
        }
    }
    static void outputApplicationFault(ApplicationFault dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputApplicationFault * * *");
            outputStatusMessage(String.format("TrackingId: %s", dataObject.getTrackingId()));
            if(dataObject instanceof AdApiFaultDetail)
            {
                outputAdApiFaultDetail((AdApiFaultDetail)dataObject);
            }
            if(dataObject instanceof ApiFault)
            {
                outputApiFault((ApiFault)dataObject);
            }
            outputStatusMessage("* * * End OutputApplicationFault * * *");
        }
    }
    static void outputArrayOfApplicationFault(ArrayList<ApplicationFault> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ApplicationFault dataObject : dataObjects)
            {
                outputApplicationFault(dataObject);
            }
        }
    }
    static void outputClientLink(ClientLink dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputClientLink * * *");
            outputStatusMessage(String.format("Type: %s", dataObject.getType()));
            outputStatusMessage(String.format("ClientEntityId: %s", dataObject.getClientEntityId()));
            outputStatusMessage(String.format("ClientEntityNumber: %s", dataObject.getClientEntityNumber()));
            outputStatusMessage(String.format("ClientEntityName: %s", dataObject.getClientEntityName()));
            outputStatusMessage(String.format("ManagingCustomerId: %s", dataObject.getManagingCustomerId()));
            outputStatusMessage(String.format("ManagingCustomerNumber: %s", dataObject.getManagingCustomerNumber()));
            outputStatusMessage(String.format("ManagingCustomerName: %s", dataObject.getManagingCustomerName()));
            outputStatusMessage(String.format("Note: %s", dataObject.getNote()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("InviterEmail: %s", dataObject.getInviterEmail()));
            outputStatusMessage(String.format("InviterName: %s", dataObject.getInviterName()));
            outputStatusMessage(String.format("InviterPhone: %s", dataObject.getInviterPhone()));
            outputStatusMessage(String.format("IsBillToClient: %s", dataObject.getIsBillToClient()));
            outputStatusMessage(String.format("StartDate: %s", dataObject.getStartDate()));
            outputStatusMessage(String.format("Status: %s", dataObject.getStatus()));
            outputStatusMessage(String.format("SuppressNotification: %s", dataObject.getSuppressNotification()));
            outputStatusMessage(String.format("LastModifiedDateTime: %s", dataObject.getLastModifiedDateTime()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("Timestamp: %s", dataObject.getTimestamp()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("CustomerLinkPermission: %s", dataObject.getCustomerLinkPermission()));
            outputStatusMessage("* * * End OutputClientLink * * *");
        }
    }
    static void outputArrayOfClientLink(ArrayOfClientLink dataObjects)
    {
        if (null != dataObjects)
        {
            for (ClientLink dataObject : dataObjects.getClientLinks())
            {
                outputClientLink(dataObject);
            }
        }
    }
    static void outputContactInfo(ContactInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputContactInfo * * *");
            outputStatusMessage("Address:");
            outputAddress(dataObject.getAddress());
            outputStatusMessage(String.format("ContactByPhone: %s", dataObject.getContactByPhone()));
            outputStatusMessage(String.format("ContactByPostalMail: %s", dataObject.getContactByPostalMail()));
            outputStatusMessage(String.format("Email: %s", dataObject.getEmail()));
            outputStatusMessage(String.format("EmailFormat: %s", dataObject.getEmailFormat()));
            outputStatusMessage(String.format("Fax: %s", dataObject.getFax()));
            outputStatusMessage(String.format("HomePhone: %s", dataObject.getHomePhone()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Mobile: %s", dataObject.getMobile()));
            outputStatusMessage(String.format("Phone1: %s", dataObject.getPhone1()));
            outputStatusMessage(String.format("Phone2: %s", dataObject.getPhone2()));
            outputStatusMessage("* * * End OutputContactInfo * * *");
        }
    }
    static void outputArrayOfContactInfo(ArrayList<ContactInfo> dataObjects)
    {
        if (null != dataObjects)
        {
            for (ContactInfo dataObject : dataObjects)
            {
                outputContactInfo(dataObject);
            }
        }
    }
    static void outputCustomer(Customer dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCustomer * * *");
            outputStatusMessage(String.format("CustomerFinancialStatus: %s", dataObject.getCustomerFinancialStatus()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Industry: %s", dataObject.getIndustry()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("MarketCountry: %s", dataObject.getMarketCountry()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage(String.format("MarketLanguage: %s", dataObject.getMarketLanguage()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage(String.format("ServiceLevel: %s", dataObject.getServiceLevel()));
            outputStatusMessage(String.format("CustomerLifeCycleStatus: %s", dataObject.getCustomerLifeCycleStatus()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
            outputStatusMessage(String.format("Number: %s", dataObject.getNumber()));
            outputStatusMessage("CustomerAddress:");
            outputAddress(dataObject.getCustomerAddress());
            outputStatusMessage("* * * End OutputCustomer * * *");
        }
    }
    static void outputArrayOfCustomer(ArrayOfCustomer dataObjects)
    {
        if (null != dataObjects)
        {
            for (Customer dataObject : dataObjects.getCustomers())
            {
                outputCustomer(dataObject);
            }
        }
    }
    static void outputCustomerInfo(CustomerInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCustomerInfo * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("Name: %s", dataObject.getName()));
            outputStatusMessage("* * * End OutputCustomerInfo * * *");
        }
    }
    static void outputArrayOfCustomerInfo(ArrayOfCustomerInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (CustomerInfo dataObject : dataObjects.getCustomerInfos())
            {
                outputCustomerInfo(dataObject);
            }
        }
    }
    static void outputCustomerRole(CustomerRole dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputCustomerRole * * *");
            outputStatusMessage(String.format("RoleId: %s", dataObject.getRoleId()));
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage("AccountIds:");
            outputArrayOflong(dataObject.getAccountIds());
            outputStatusMessage("LinkedAccountIds:");
            outputArrayOflong(dataObject.getLinkedAccountIds());
            outputStatusMessage(String.format("CustomerLinkPermission: %s", dataObject.getCustomerLinkPermission()));
            outputStatusMessage("* * * End OutputCustomerRole * * *");
        }
    }
    static void outputArrayOfCustomerRole(ArrayOfCustomerRole dataObjects)
    {
        if (null != dataObjects)
        {
            for (CustomerRole dataObject : dataObjects.getCustomerRoles())
            {
                outputCustomerRole(dataObject);
            }
        }
    }
    static void outputDateRange(DateRange dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputDateRange * * *");
            outputStatusMessage(String.format("MinDate: %s", dataObject.getMinDate()));
            outputStatusMessage(String.format("MaxDate: %s", dataObject.getMaxDate()));
            outputStatusMessage("* * * End OutputDateRange * * *");
        }
    }
    static void outputArrayOfDateRange(ArrayList<DateRange> dataObjects)
    {
        if (null != dataObjects)
        {
            for (DateRange dataObject : dataObjects)
            {
                outputDateRange(dataObject);
            }
        }
    }
    static void outputKeyValuePairOfstringstring(KeyValuePairOfstringstring dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputKeyValuePairOfstringstring * * *");
            outputStatusMessage(String.format("Key: %s", dataObject.getKey()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputKeyValuePairOfstringstring * * *");
        }
    }
    static void outputArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring dataObjects)
    {
        if (null != dataObjects)
        {
            for (KeyValuePairOfstringstring dataObject : dataObjects.getKeyValuePairOfstringstrings())
            {
                outputKeyValuePairOfstringstring(dataObject);
            }
        }
    }
    static void outputOperationError(OperationError dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOperationError * * *");
            outputStatusMessage(String.format("Code: %s", dataObject.getCode()));
            outputStatusMessage(String.format("Details: %s", dataObject.getDetails()));
            outputStatusMessage(String.format("Message: %s", dataObject.getMessage()));
            outputStatusMessage("* * * End OutputOperationError * * *");
        }
    }
    static void outputArrayOfOperationError(ArrayOfOperationError dataObjects)
    {
        if (null != dataObjects)
        {
            for (OperationError dataObject : dataObjects.getOperationErrors())
            {
                outputOperationError(dataObject);
            }
        }
    }
    static void outputOrderBy(OrderBy dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputOrderBy * * *");
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Order: %s", dataObject.getOrder()));
            outputStatusMessage("* * * End OutputOrderBy * * *");
        }
    }
    static void outputArrayOfOrderBy(ArrayOfOrderBy dataObjects)
    {
        if (null != dataObjects)
        {
            for (OrderBy dataObject : dataObjects.getOrderBies())
            {
                outputOrderBy(dataObject);
            }
        }
    }
    static void outputPaging(Paging dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPaging * * *");
            outputStatusMessage(String.format("Index: %s", dataObject.getIndex()));
            outputStatusMessage(String.format("Size: %s", dataObject.getSize()));
            outputStatusMessage("* * * End OutputPaging * * *");
        }
    }
    static void outputArrayOfPaging(ArrayList<Paging> dataObjects)
    {
        if (null != dataObjects)
        {
            for (Paging dataObject : dataObjects)
            {
                outputPaging(dataObject);
            }
        }
    }
    static void outputPersonName(PersonName dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPersonName * * *");
            outputStatusMessage(String.format("FirstName: %s", dataObject.getFirstName()));
            outputStatusMessage(String.format("LastName: %s", dataObject.getLastName()));
            outputStatusMessage(String.format("MiddleInitial: %s", dataObject.getMiddleInitial()));
            outputStatusMessage("* * * End OutputPersonName * * *");
        }
    }
    static void outputArrayOfPersonName(ArrayList<PersonName> dataObjects)
    {
        if (null != dataObjects)
        {
            for (PersonName dataObject : dataObjects)
            {
                outputPersonName(dataObject);
            }
        }
    }
    static void outputPredicate(Predicate dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputPredicate * * *");
            outputStatusMessage(String.format("Field: %s", dataObject.getField()));
            outputStatusMessage(String.format("Operator: %s", dataObject.getOperator()));
            outputStatusMessage(String.format("Value: %s", dataObject.getValue()));
            outputStatusMessage("* * * End OutputPredicate * * *");
        }
    }
    static void outputArrayOfPredicate(ArrayOfPredicate dataObjects)
    {
        if (null != dataObjects)
        {
            for (Predicate dataObject : dataObjects.getPredicates())
            {
                outputPredicate(dataObject);
            }
        }
    }
    static void outputUser(User dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUser * * *");
            outputStatusMessage("ContactInfo:");
            outputContactInfo(dataObject.getContactInfo());
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("JobTitle: %s", dataObject.getJobTitle()));
            outputStatusMessage(String.format("LastModifiedByUserId: %s", dataObject.getLastModifiedByUserId()));
            outputStatusMessage(String.format("LastModifiedTime: %s", dataObject.getLastModifiedTime()));
            outputStatusMessage(String.format("Lcid: %s", dataObject.getLcid()));
            outputStatusMessage("Name:");
            outputPersonName(dataObject.getName());
            outputStatusMessage(String.format("Password: %s", dataObject.getPassword()));
            outputStatusMessage(String.format("SecretAnswer: %s", dataObject.getSecretAnswer()));
            outputStatusMessage(String.format("SecretQuestion: %s", dataObject.getSecretQuestion()));
            outputStatusMessage(String.format("UserLifeCycleStatus: %s", dataObject.getUserLifeCycleStatus()));
            outputStatusMessage(String.format("TimeStamp: %s", dataObject.getTimeStamp()));
            outputStatusMessage(String.format("UserName: %s", dataObject.getUserName()));
            outputStatusMessage("ForwardCompatibilityMap:");
            outputArrayOfKeyValuePairOfstringstring(dataObject.getForwardCompatibilityMap());
            outputStatusMessage("* * * End OutputUser * * *");
        }
    }
    static void outputArrayOfUser(ArrayList<User> dataObjects)
    {
        if (null != dataObjects)
        {
            for (User dataObject : dataObjects)
            {
                outputUser(dataObject);
            }
        }
    }
    static void outputUserInfo(UserInfo dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUserInfo * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("UserName: %s", dataObject.getUserName()));
            outputStatusMessage("* * * End OutputUserInfo * * *");
        }
    }
    static void outputArrayOfUserInfo(ArrayOfUserInfo dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserInfo dataObject : dataObjects.getUserInfos())
            {
                outputUserInfo(dataObject);
            }
        }
    }
    static void outputUserInvitation(UserInvitation dataObject)
    {
        if (null != dataObject)
        {
            outputStatusMessage("* * * Begin OutputUserInvitation * * *");
            outputStatusMessage(String.format("Id: %s", dataObject.getId()));
            outputStatusMessage(String.format("FirstName: %s", dataObject.getFirstName()));
            outputStatusMessage(String.format("LastName: %s", dataObject.getLastName()));
            outputStatusMessage(String.format("Email: %s", dataObject.getEmail()));
            outputStatusMessage(String.format("CustomerId: %s", dataObject.getCustomerId()));
            outputStatusMessage(String.format("RoleId: %s", dataObject.getRoleId()));
            outputStatusMessage("AccountIds:");
            outputArrayOflong(dataObject.getAccountIds());
            outputStatusMessage(String.format("ExpirationDate: %s", dataObject.getExpirationDate()));
            outputStatusMessage(String.format("Lcid: %s", dataObject.getLcid()));
            outputStatusMessage("* * * End OutputUserInvitation * * *");
        }
    }
    static void outputArrayOfUserInvitation(ArrayOfUserInvitation dataObjects)
    {
        if (null != dataObjects)
        {
            for (UserInvitation dataObject : dataObjects.getUserInvitations())
            {
                outputUserInvitation(dataObject);
            }
        }
    }
    static void outputAccountLifeCycleStatus(AccountLifeCycleStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountLifeCycleStatus value : AccountLifeCycleStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountLifeCycleStatus(ArrayList<AccountLifeCycleStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AccountLifeCycleStatus valueSet : valueSets)
            {
                outputAccountLifeCycleStatus(valueSet);
            }
        }
    }
    static void outputCurrencyCode(CurrencyCode valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CurrencyCode value : CurrencyCode.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCurrencyCode(ArrayList<CurrencyCode> valueSets)
    {
        if (null != valueSets)
        {
            for (CurrencyCode valueSet : valueSets)
            {
                outputCurrencyCode(valueSet);
            }
        }
    }
    static void outputAccountFinancialStatus(AccountFinancialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AccountFinancialStatus value : AccountFinancialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAccountFinancialStatus(ArrayList<AccountFinancialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (AccountFinancialStatus valueSet : valueSets)
            {
                outputAccountFinancialStatus(valueSet);
            }
        }
    }
    static void outputLanguageType(LanguageType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (LanguageType value : LanguageType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfLanguageType(ArrayList<LanguageType> valueSets)
    {
        if (null != valueSets)
        {
            for (LanguageType valueSet : valueSets)
            {
                outputLanguageType(valueSet);
            }
        }
    }
    static void outputPaymentMethodType(PaymentMethodType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PaymentMethodType value : PaymentMethodType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPaymentMethodType(ArrayList<PaymentMethodType> valueSets)
    {
        if (null != valueSets)
        {
            for (PaymentMethodType valueSet : valueSets)
            {
                outputPaymentMethodType(valueSet);
            }
        }
    }
    static void outputTimeZoneType(TimeZoneType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (TimeZoneType value : TimeZoneType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfTimeZoneType(ArrayList<TimeZoneType> valueSets)
    {
        if (null != valueSets)
        {
            for (TimeZoneType valueSet : valueSets)
            {
                outputTimeZoneType(valueSet);
            }
        }
    }
    static void outputAutoTagType(AutoTagType valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (AutoTagType value : AutoTagType.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfAutoTagType(ArrayList<AutoTagType> valueSets)
    {
        if (null != valueSets)
        {
            for (AutoTagType valueSet : valueSets)
            {
                outputAutoTagType(valueSet);
            }
        }
    }
    static void outputCustomerFinancialStatus(CustomerFinancialStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CustomerFinancialStatus value : CustomerFinancialStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCustomerFinancialStatus(ArrayList<CustomerFinancialStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (CustomerFinancialStatus valueSet : valueSets)
            {
                outputCustomerFinancialStatus(valueSet);
            }
        }
    }
    static void outputIndustry(Industry valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (Industry value : Industry.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfIndustry(ArrayList<Industry> valueSets)
    {
        if (null != valueSets)
        {
            for (Industry valueSet : valueSets)
            {
                outputIndustry(valueSet);
            }
        }
    }
    static void outputServiceLevel(ServiceLevel valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ServiceLevel value : ServiceLevel.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfServiceLevel(ArrayList<ServiceLevel> valueSets)
    {
        if (null != valueSets)
        {
            for (ServiceLevel valueSet : valueSets)
            {
                outputServiceLevel(valueSet);
            }
        }
    }
    static void outputCustomerLifeCycleStatus(CustomerLifeCycleStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (CustomerLifeCycleStatus value : CustomerLifeCycleStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfCustomerLifeCycleStatus(ArrayList<CustomerLifeCycleStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (CustomerLifeCycleStatus valueSet : valueSets)
            {
                outputCustomerLifeCycleStatus(valueSet);
            }
        }
    }
    static void outputEmailFormat(EmailFormat valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (EmailFormat value : EmailFormat.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfEmailFormat(ArrayList<EmailFormat> valueSets)
    {
        if (null != valueSets)
        {
            for (EmailFormat valueSet : valueSets)
            {
                outputEmailFormat(valueSet);
            }
        }
    }
    static void outputLCID(LCID valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (LCID value : LCID.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfLCID(ArrayList<LCID> valueSets)
    {
        if (null != valueSets)
        {
            for (LCID valueSet : valueSets)
            {
                outputLCID(valueSet);
            }
        }
    }
    static void outputSecretQuestion(SecretQuestion valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SecretQuestion value : SecretQuestion.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSecretQuestion(ArrayList<SecretQuestion> valueSets)
    {
        if (null != valueSets)
        {
            for (SecretQuestion valueSet : valueSets)
            {
                outputSecretQuestion(valueSet);
            }
        }
    }
    static void outputUserLifeCycleStatus(UserLifeCycleStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (UserLifeCycleStatus value : UserLifeCycleStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfUserLifeCycleStatus(ArrayList<UserLifeCycleStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (UserLifeCycleStatus valueSet : valueSets)
            {
                outputUserLifeCycleStatus(valueSet);
            }
        }
    }
    static void outputPredicateOperator(PredicateOperator valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (PredicateOperator value : PredicateOperator.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfPredicateOperator(ArrayList<PredicateOperator> valueSets)
    {
        if (null != valueSets)
        {
            for (PredicateOperator valueSet : valueSets)
            {
                outputPredicateOperator(valueSet);
            }
        }
    }
    static void outputOrderByField(OrderByField valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (OrderByField value : OrderByField.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfOrderByField(ArrayList<OrderByField> valueSets)
    {
        if (null != valueSets)
        {
            for (OrderByField valueSet : valueSets)
            {
                outputOrderByField(valueSet);
            }
        }
    }
    static void outputSortOrder(SortOrder valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (SortOrder value : SortOrder.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfSortOrder(ArrayList<SortOrder> valueSets)
    {
        if (null != valueSets)
        {
            for (SortOrder valueSet : valueSets)
            {
                outputSortOrder(valueSet);
            }
        }
    }
    static void outputClientLinkStatus(ClientLinkStatus valueSet)
    {
        outputStatusMessage(String.format("Values in %s", valueSet.toString()));
        for (ClientLinkStatus value : ClientLinkStatus.values())
        {
            outputStatusMessage(value.toString());
        }
    }
    static void outputArrayOfClientLinkStatus(ArrayList<ClientLinkStatus> valueSets)
    {
        if (null != valueSets)
        {
            for (ClientLinkStatus valueSet : valueSets)
            {
                outputClientLinkStatus(valueSet);
            }
        }
    }
    // Prints the string to System.out
    static void outputStatusMessage(java.lang.String message)
    {
        System.out.println(message);
    }
    static void outputArrayOfstring(ArrayOfstring items)
    {
        if (null != items)
        {
            for (java.lang.String item : items.getStrings())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
    static void outputArrayOflong(ArrayOflong items)
    {
        if (null != items)
        {
            for (java.lang.Long item : items.getLongs())
            {
                outputStatusMessage(String.format("%s", item));
            }
        }
    }
}