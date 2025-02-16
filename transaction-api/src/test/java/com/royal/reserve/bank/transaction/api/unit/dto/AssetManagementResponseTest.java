package com.royal.reserve.bank.transaction.api.unit.dto;

import com.royal.reserve.bank.transaction.api.dto.AssetManagementResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the {@link AssetManagementResponse} class.
 */
class AssetManagementResponseTest {

    /**
     * Test the constructors.
     */
    @Test
    void testAssetManagementResponse() {
        // Given
        String expectedAssetCode = "F";
        boolean expectedIsAssetAvailable = true;

        // When
        AssetManagementResponse response = AssetManagementResponse.builder()
                .assetCode(expectedAssetCode)
                .isAssetAvailable(expectedIsAssetAvailable)
                .build();

        // Then
        Assertions.assertEquals(expectedAssetCode, response.getAssetCode());
        Assertions.assertTrue(response.isAssetAvailable());
    }
}
